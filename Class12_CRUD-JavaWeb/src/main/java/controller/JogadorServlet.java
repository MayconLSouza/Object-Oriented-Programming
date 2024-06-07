package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Jogador;
import model.Time;
import persistence.GenericDao;
import persistence.JogadorDao;
import persistence.TimeDao;

@WebServlet("/jogador")
public class JogadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JogadorServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String erro = "";
		List<Time> times = new ArrayList<>();

		GenericDao gDao = new GenericDao();
		TimeDao tDao = new TimeDao(gDao);

		try {
			times = tDao.listar();
		} catch (ClassNotFoundException | SQLException e) {
			erro = e.getMessage();
		} finally {
			request.setAttribute("erro", erro);
			request.setAttribute("times", times);

			RequestDispatcher rd = request.getRequestDispatcher("jogador.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Entrada
		String cmd = request.getParameter("botao");
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String data_nasc = request.getParameter("data_nasc");
		String altura = request.getParameter("altura");
		String peso = request.getParameter("peso");
		String time = request.getParameter("time");

		// Retorno
		String saida = "";
		String erro = "";
		Jogador j = new Jogador();
		List<Time> times = new ArrayList<>();
		List<Jogador> jogadores = new ArrayList<>();
		
		if(!cmd.contains("Listar")) {
			j.setId(Integer.parseInt(id));
		}
		try {
			times = listarTime();
			if(cmd.contains("Cadastrar") || cmd.contains("Alterar")) {
				j.setNome(nome);
				j.setAltura(Double.parseDouble(altura));
				j.setPeso(Double.parseDouble(peso));
				
				Time t = new Time();
				t.setCodigo(Integer.parseInt(time));
				t = buscarTime(t);
				j.setTime(t);
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date dataNascimentoUtil = null;
				try {
					dataNascimentoUtil = sdf.parse(data_nasc);
				} catch (ParseException e) {
					e.printStackTrace();
				}

				java.sql.Date dataNascimentoSql = new java.sql.Date(dataNascimentoUtil.getTime());
				j.setData_nasc(dataNascimentoSql);

			}
			if(cmd.contains("Cadastrar")) {
				cadastrarJogador(j);
				saida = "Jogador cadastrado com sucesso";
				j = null;
			}
			if(cmd.contains("Alterar")) {
				alterarJogador(j);
				saida = "Jogador alterado com sucesso";
				j = null;
			}
			if(cmd.contains("Excluir")) {
				excluirJogador(j);
				saida = "Time excluído com sucesso";
				j = null;
			}
			if(cmd.contains("Buscar")) {
				j = buscarJogador(j);
			}
			if(cmd.contains("Listar")) {
				jogadores = listarJogadores();
			}
		} catch (SQLException | ClassNotFoundException e) {
			erro = e.getMessage();
		} finally {
			request.setAttribute("saida", saida);
            request.setAttribute("erro", erro);
            request.setAttribute("jogador", j);
            request.setAttribute("jogadores", jogadores);
            request.setAttribute("times", times);

            RequestDispatcher rd = request.getRequestDispatcher("jogador.jsp");
            rd.forward(request, response);
		}

	}
	
	private void cadastrarJogador(Jogador j) throws SQLException, ClassNotFoundException{
		GenericDao gDao = new GenericDao();
        JogadorDao jDao = new JogadorDao(gDao);
        jDao.inserir(j);
		
	}

	private void alterarJogador(Jogador j) throws SQLException, ClassNotFoundException{
		GenericDao gDao = new GenericDao();
        JogadorDao jDao = new JogadorDao(gDao);
        jDao.atualizar(j);
		
	}

	private void excluirJogador(Jogador j) throws SQLException, ClassNotFoundException{
		GenericDao gDao = new GenericDao();
        JogadorDao jDao = new JogadorDao(gDao);
        jDao.excluir(j);
		
	}

	private Jogador buscarJogador(Jogador j) throws SQLException, ClassNotFoundException{
		GenericDao gDao = new GenericDao();
        JogadorDao jDao = new JogadorDao(gDao);
        return jDao.consultar(j);
	}

	private List<Jogador> listarJogadores() throws SQLException, ClassNotFoundException{
		GenericDao gDao = new GenericDao();
        JogadorDao jDao = new JogadorDao(gDao);
        return jDao.listar();
	}

	private Time buscarTime(Time t) throws SQLException, ClassNotFoundException {
		GenericDao gDao = new GenericDao();
		TimeDao tDao = new TimeDao(gDao);
		t = tDao.consultar(t);

		return t;
	}

	private List<Time> listarTime() throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		TimeDao tDao = new TimeDao(gDao);
		List<Time> times = tDao.listar();

		return times;
	}

}

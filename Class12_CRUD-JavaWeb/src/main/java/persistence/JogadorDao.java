package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Jogador;
import model.Time;

public class JogadorDao implements ICrud<Jogador>{
	
	private GenericDao gDao;

	public JogadorDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public void inserir(Jogador j) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String SQL = "INSERT INTO jogador VALUES (?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = c.prepareStatement(SQL);
		ps.setInt(1, j.getId());
		ps.setString(2, j.getNome());
		ps.setDate(3, j.getData_nasc());
		ps.setDouble(4, j.getAltura());
		ps.setDouble(5, j.getPeso());
		ps.setInt(6, j.getTime().getCodigo());
		ps.execute();
		ps.close();
		c.close();
	}

	@Override
	public void atualizar(Jogador j) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String SQL = "UPDATE jogador SET nome=?, data_nasc=?, altura=?, peso=?, time_codigo=? WHERE id=?";
		PreparedStatement ps = c.prepareStatement(SQL);
		ps.setString(1, j.getNome());
		ps.setDate(2, j.getData_nasc());
		ps.setDouble(3, j.getAltura());
		ps.setDouble(4, j.getPeso());
		ps.setInt(5, j.getTime().getCodigo());
		ps.setInt(6, j.getId());
		ps.execute();
		ps.close();
		c.close();
		
	}

	@Override
	public void excluir(Jogador j) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String SQL = "DELETE FROM jogador WHERE id=?";
		PreparedStatement ps = c.prepareStatement(SQL);
		ps.setInt(1, j.getId());
		ps.execute();
		ps.close();
		c.close();
	}

	@Override
	public Jogador consultar(Jogador j) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT j.id AS id, j.nome AS nome, ");
		sql.append("j.data_nasc AS data_nasc, j.altura AS altura, ");
		sql.append("j.peso AS peso, ");
		sql.append("t.codigo AS CodTime, t.nome AS NomeTime, t.cidade AS CidadeTime ");
		sql.append("FROM time t, jogador j ");
		sql.append("WHERE t.codigo = j.time_codigo ");
		sql.append("AND j.id = ? ");
		
		PreparedStatement ps = c.prepareStatement(sql.toString());
		ps.setInt(1, j.getId());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Time t = new Time();
			
			t.setCodigo(rs.getInt("CodTime"));
			t.setNome(rs.getString("NomeTime"));
			t.setCidade(rs.getString("CidadeTime"));
			
			j.setId(rs.getInt("id"));
			j.setNome(rs.getString("nome"));
			j.setData_nasc(rs.getDate("data_nasc"));
			j.setAltura(rs.getDouble("altura"));
			j.setPeso(rs.getDouble("peso"));
			j.setTime(t);
		}
		
		rs.close();
		ps.close();
		c.close();
		return j;
	}

	@Override
	public List<Jogador> listar() throws SQLException, ClassNotFoundException {
		List<Jogador> jogadores = new ArrayList<>();
		
		Connection c = gDao.getConnection();
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT j.id AS id, j.nome AS nome, ");
		sql.append("j.data_nasc AS data_nasc, j.altura AS altura, ");
		sql.append("j.peso AS peso, ");
		sql.append("t.Codigo AS CodTime, t.nome AS NomeTime, t.cidade AS CidadeTime ");
		sql.append("FROM time t, jogador j ");
		sql.append("WHERE t.codigo = j.time_codigo ");
		
		PreparedStatement ps = c.prepareStatement(sql.toString());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Time t = new Time();
			
			t.setCodigo(rs.getInt("CodTime"));
			t.setNome(rs.getString("NomeTime"));
			t.setCidade(rs.getString("CidadeTime"));
			
			Jogador j = new Jogador();
			j.setId(rs.getInt("id"));
			j.setNome(rs.getString("nome"));
			j.setData_nasc(rs.getDate("data_nasc"));
			j.setAltura(rs.getDouble("altura"));
			j.setPeso(rs.getDouble("peso"));
			j.setTime(t);
			
			jogadores.add(j);
		}
		rs.close();
		ps.close();
		c.close();
		return jogadores;
	}

}

package com.sebastian.garcia.game.model.repository;

import com.sebastian.garcia.game.model.ScoreHistory;
import java.sql.*;

public class HistoricoRepository {
    
    private static final String SQL_INSERT = "INSERT INTO historico(username, score) VALUES(?, ?)";

    public int insert(ScoreHistory scoreHistory) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, scoreHistory.getUsername());
            stmt.setInt(2, scoreHistory.getScore());
            
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
       return rows; 
    }
}

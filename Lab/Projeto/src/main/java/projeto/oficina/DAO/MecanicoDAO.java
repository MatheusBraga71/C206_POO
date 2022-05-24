package projeto.oficina.DAO;

import projeto.oficina.funcionario.Mecanico;

import java.sql.SQLException;
import java.util.ArrayList;

public class MecanicoDAO extends ConnectionDAO{

    //DAO - Data Access Object

    boolean sucesso = false; //Para saber se funcionou

    public boolean inserirMecanico(Mecanico mecanico) {
        connectToDB();
        String sql = "INSERT INTO Mecanico (cpf,nome) values(?,?)";

        try { //pst é um comando utilizado para a preparação do comando, usado quando se passa algo por parâmetro
            pst = con.prepareStatement(sql);
            pst.setString(1, mecanico.getCpf());
            pst.setString(2, mecanico.getNome());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean atualizarNomeMecanico(String cpf, String nome) {
        connectToDB();
        String sql = "UPDATE Mecanico SET nome=? where cpf=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, cpf);
            pst.execute();
            sucesso = true;

        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean deletarMecanico(String cpf) {
        connectToDB();
        String sql = "DELETE FROM Mecanico where cpf=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.execute();
            sucesso = true;

        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public ArrayList<Mecanico> buscarMecanicoSemFiltro() {
        ArrayList<Mecanico> listaDeMecanicos = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Mecanico";

        try { //st é um comando usado quando a função não precisa de uma preparação, função não recebe parâmetro
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Mecanicos: ");
            while (rs.next()) {
                Mecanico mecanicoAux = new Mecanico(rs.getString("cpf"), rs.getString("nome"));
                System.out.println("CPF = " + mecanicoAux.getCpf());
                System.out.println("Nome = " + mecanicoAux.getNome());
                System.out.println("--------------------------------");
                listaDeMecanicos.add(mecanicoAux);
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return listaDeMecanicos;
    }
    public Mecanico buscarMecanicoPorCpf(String cpf) {
        connectToDB();
        Mecanico mecanicoAux = null;
        String sql = "SELECT * FROM instrumentos WHERE cpf = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("cpf");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    mecanicoAux = new Mecanico(rs.getString("cpf"), rs.getString("nome"));
                    System.out.println("CPF = " + mecanicoAux.getCpf());
                    System.out.println("Nome = " + mecanicoAux.getNome());
                    System.out.println("--------------------------------");
                }
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return mecanicoAux;
    }
}

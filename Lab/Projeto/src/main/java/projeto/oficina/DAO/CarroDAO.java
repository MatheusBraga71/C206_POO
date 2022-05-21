package projeto.oficina.DAO;

import projeto.oficina.carros.Carro;

import java.sql.SQLException;
import java.util.ArrayList;

public class CarroDAO extends ConnectionDAO{

    //DAO - Data Access Object

    boolean sucesso = false; //Para saber se funcionou

    public boolean inserirCarro(Carro carro) {
        connectToDB();
        String sql = "INSERT INTO Carro (numeroChassi,cor,modelo,Dono_cpf) values(?,?,?,?)";

        try { //pst é um comando utilizado para a preparação do comando, usado quando se passa algo por parâmetro
            pst = con.prepareStatement(sql);
            pst.setInt(1, carro.getNumeroChassi());
            pst.setString(2, carro.getCor());
            pst.setString(3, carro.getModelo());
            pst.setString(4, carro.getDono_cpf());
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

    public boolean atualizarCarro(int numeroChassi, Carro carro) {
        connectToDB();
        String sql = "UPDATE Carro SET cor=?, modelo=?, Dono_cpf=? where numeroChassi=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, carro.getCor());
            pst.setString(2, carro.getModelo());
            pst.setString(3, carro.getDono_cpf());
            pst.setInt(4, numeroChassi);
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

    public boolean deletarCarro(int numeroChassi) {
        connectToDB();
        String sql = "DELETE FROM Carro where numeroChassi=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, numeroChassi);
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

    public ArrayList<Carro> buscarCarrosSemFiltro() {
        ArrayList<Carro> listaDeCarros = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Carro";

        try { //st é um comando usado quando a função não precisa de uma preparação, função não recebe parâmetro
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Carros: ");
            while (rs.next()) {
                Carro carroAux = new Carro(rs.getInt("numeroChassi"), rs.getString("cor"), rs.getString("modelo"));
            carroAux.setDono_cpf(rs.getString("Dono_cpf"));
                System.out.println("Numero do Chassi = " + carroAux.getNumeroChassi());
                System.out.println("Cor = " + carroAux.getCor());
                System.out.println("Modelo = " + carroAux.getModelo());
                System.out.println("CPF do Dono = " + carroAux.getDono_cpf());
                System.out.println("--------------------------------");
                listaDeCarros.add(carroAux);
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
        return listaDeCarros;
    }
    public Carro buscarCarroPorNumeroDoChassi(int numeroChassi) {
        connectToDB();
        Carro carroAux = null;
        String sql = "SELECT * FROM Carro WHERE numeroChassi = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, numeroChassi);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("numeroChassi");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    carroAux = new Carro(rs.getInt("numeroChassi"), rs.getString("cor"), rs.getString("modelo"));
                    carroAux.setDono_cpf(rs.getString("Dono_cpf"));
                    System.out.println("Numero do Chassi = " + carroAux.getNumeroChassi());
                    System.out.println("Cor = " + carroAux.getCor());
                    System.out.println("Modelo = " + carroAux.getModelo());
                    System.out.println("CPF do Dono = " + carroAux.getDono_cpf());
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
        return carroAux;
    }




}

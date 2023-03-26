import javax.xml.transform.Result;
import java.sql.*;
import java.util.Random;

public class DatabaseIO {

    static Connection connection;
    private static final String url = "jdbc:mysql://localhost:3306/ChampionsDB?serverTimezone=CET&useSSL=false";
    private static final String name = "root";
    private static final String password = "admin123";
    private static final int amountOfChampions = 145;


    public static Champion pickARandomChampion(){
        establishConnection();
        Random rnd = new Random();
        int random = rnd.nextInt(amountOfChampions);
        random++;
        String query = "SELECT * FROM Champions WHERE ChampionsID = " + random + ";";
        String name, gender, role, resource, rangeType;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return new Champion(resultSet.getString("Name"),resultSet.getString("Gender"),resultSet.getString("Role"),resultSet.getString("Resource"),resultSet.getString("RangeType"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new Champion("", "", "", "", "");
    }

    private static void establishConnection(){
        try {
        connection = DriverManager.getConnection(url, name, password);
        } catch (SQLException SQLE){
            System.out.println(SQLE);
        }

    }

}

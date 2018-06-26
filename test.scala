import java.sql.DriverManager
import java.sql.Connection
object ReadPassword {  
  def getPassword(): Connection  = {
    print("UserID> ")
    val UserID = scala.io.StdIn.readLine()
    print("Password> ")
    val pw = scala.io.StdIn.readLine()
    var connection:Connection = null
    val v_host = "****"
    val v_PORT = "****"
    val v_service = "****"
    val Url = "jdbc:oracle:thin:" + UserID + "/"+pw+"@(DESCRIPTION = (ADDRESS = (PROTOCOL = TCPS)(HOST = "+ v_host +")(PORT = "+ v_PORT +"))(CONNECT_DATA = (SERVER = DEDICATED) (SERVICE_NAME = "+ v_service +") ))"
    connection = DriverManager.getConnection(Url)
    return connection
  }
}
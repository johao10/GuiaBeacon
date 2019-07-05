
<?PHP
$hostname="localhost";
$database="db_guiacampus";
$username="root";
$password="";
$json=array();
		
		$conexion=mysqli_connect($hostname,$username,$password,$database);
		
		$consulta="SELECT * FROM tbl_horario ";
		$resultado=mysqli_query($conexion,$consulta);

		while($reg=mysqli_fetch_array($resultado)){
				$json['datos'][]=$reg;
			}
			mysqli_close($conexion);
			echo json_encode($json);
		

?>
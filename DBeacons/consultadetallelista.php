
<?PHP
$hostname="localhost";
$database="db_guiacampus";
$username="root";
$password="";
$json=array();
		$id_horario=$_GET['id_horario'];
		$conexion=mysqli_connect($hostname,$username,$password,$database);
		$consulta="SELECT * FROM tbl_horario thorario join tbl_hora thora 
		on thorario.id_horario = thora.id_horario
		where thorario.id_horario= '{$id_horario}'";
		$resultado=mysqli_query($conexion,$consulta);

		while($reg=mysqli_fetch_array($resultado)){
				$json['datos'][]=$reg;
			}
			mysqli_close($conexion);
			echo json_encode($json);
		

?>
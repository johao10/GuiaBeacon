
<?PHP
$hostname="localhost";
$database="db_guiacampus";
$username="root";
$password="";
$json=array();

		$beacon = $_GET['beacon'];
		$conexion=mysqli_connect($hostname,$username,$password,$database);
		
		$consulta="SELECT * FROM tbl_horario WHERE cod_beacon='{$beacon}'";
		$resultado=mysqli_query($conexion,$consulta);

		while($fila =  mysqli_fetch_array($resultado)){
			$horario[]= array_map('utf8_encode',$fila);
		}

		echo json_encode($horario);
		$resultado -> close();
	?>
<?php

$hostname="localhost";
$database="db_guiacampus";
$username="root";
$password="";
$json=array();
		
		$nombre_beacon=$_GET['nombre_beacon'];
		$conexion=mysqli_connect($hostname,$username,$password,$database);
		$consulta = "SELECT tbl_ambiente.imagen_amb from tbl_horario inner join tbl_detall_ambiente on tbl_detall_ambiente.id_bea = tbl_horario.id_horario inner join tbl_ambiente on tbl_detall_ambiente.id_amb = tbl_ambiente.id_amb where tbl_horario.nombre_beacon ='$nombre_beacon'";
		$resultado = $conexion -> query($consulta);

		while($fila = $resultado -> fetch_array()){
				$horarios[] = array_map('utf8_encode', $fila);
			}
		echo json_encode($horarios);
		$resultado -> close();
?>


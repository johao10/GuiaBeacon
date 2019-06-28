
<?php
$hostname="localhost";
$database="db_guiacampus";
$username="root";
$password="";
$conexion = new mysqli($hostname,$username,$password,$database);
if($conexion->connect_errno){
	echo "lo sentimos";
}
?>
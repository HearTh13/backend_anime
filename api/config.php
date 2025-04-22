<?php
$host = 'localhost';
$user = 'root';
$pass = 'root';
$db   = 'undangan';

$conn = new mysqli($host, $user, $pass, $db);

if($conn -> connect_error){
    http_response_code(500);
    die(json_encode([
        'status'  => 'error',
        'code'    => '500',
        'message' => 'connection error'
    ]));
}
?>
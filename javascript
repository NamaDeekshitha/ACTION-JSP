<!DOCTYPE html>
<html>
<head>
<title>variables</title>
</head>
<body>
<img src="teddy.png" id="deek" onmouseover="newpicture()" onmouseout="oldpicture()">

<p id="demo"></p>
<p id="demo1"></p>
<p id="demo2"></p>
<p id="demo3"></p>
<script>
function newpicture(){
document.getElementById("deek").src="shortgirl.jpg";
}
function oldpicture(){
document.getElementById("deek").src="teddy.png";
}

var x=1;
var y=2;
var z=3;
var total=x+y+z;
var total1=x+y-z;
var total2=x*y+z;
var total3=y+z-x;
document.getElementById('demo').innerHTML="The total is:" + "total;
document.getElementById('demo1').innerHTML="The total is:" + "total1;
document.getElementById('demo2').innerHTML="The total is:" + "total2;
document.getElementById('demo3').innerHTML="The total is:" + "total3;

</script>
</body>
</html>

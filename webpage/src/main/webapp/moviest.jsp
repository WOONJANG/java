<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일일 영화 순위 공작소 + movie_api.java</title>
</head>
<body>
	<table border="1" cellpadding="0" cellspacing="0">
		<thead>
			<tr">
				<th width="80">순위</th>
				<th width="200">영화제목</th>
				<th width="200">누적관객수</th>
			</tr>
		</thead>
		<tbody id="listview">
		</tbody>
	</table>
</body>
<script>
	let today = "2022-09-08";
	let ajax = new XMLHttpRequest();
	ajax.open("GET", "http://localhost:8080/webpage/movie?apikey=movie_146&apidate=" + today, true);
	ajax.send();
	
	ajax.onreadystatechange = function(){
		if(ajax.status == 200 && ajax.readyState == XMLHttpRequest.DONE){
// 			console.log(ajax.response);
			var mdata = JSON.parse(ajax.response);
// 			console.log(mdata);
			html_print(mdata);
		}
	}
	
	function html_print(mdata) {
		let pt = document.getElementById("listview");
		let ea = mdata.length;	// 10
		let htmlcode = "";
		let icon = "";	// 신규 진입한 영화 아이콘 (이미지)
// 		console.log(ea);
		var k = 0;
		do{
			if(mdata[k]['arankpart'] == "NEW"){
				icon = "ⓝ";
			}
			else{
				icon = "";
			}
			
			htmlcode += "<tr>";
			htmlcode += "<td style='text-align:center;'>" + mdata[k]['arank'] + "</td>";
			htmlcode += "<td style='text-align:center;'>" + icon + " " + mdata[k]['anm'] + "</td>";
			htmlcode += "<td style='text-align:right;'>" + Number(mdata[k]['aperson']).toLocaleString() + " 명" + "</td>";
			htmlcode += "</tr>";
// 			let totalperson += (int)mdata[k]['aperson'];
// 			htmlcode += "<tr>";
// 			htmlcode += "<td colspan='3'>"+ totalperson +"</td>";
// 			htmlcode += "</tr>";
			k++;
		}while(k < ea);
		
		pt.innerHTML = htmlcode;
	}
</script>
</html>
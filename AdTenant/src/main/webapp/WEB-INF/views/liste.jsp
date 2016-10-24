<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Résultats</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Stylesdf20.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/CSS/validation.js"></script>
</head>

<body class="aval fr-fr ResultList">
	<div id="headerMarqueBlanche"></div>
	<!-- MENU -->
	<jsp:include page="header.jsp" />
	<div class="s-engine">
		<div class="search-header">
			<h1 id="annonces-paris">
				<form method="post" style="position: relative; left: 180px">
					<div class="categ c-search">
						<div class="srchTitle" style="width: 620px; height: 120px">
						
							<input id="prix" maxlength="50" name="price" placeholder="Prix ($)" type="text" value="" />
							
							<input id="surface" maxlength="50" name="area" placeholder="Surface (mxm)" type="text" value="" />
							
							<input id="numberOfParts" maxlength="50" name="numberOfParts" placeholder="Nombre de pièce" type="text" value="" />
							
							<input type="submit" value="Chercher" size="10">
						</div>
					</div>
				</form>
			</h1>
			<div class="localityStatsText"></div>
		</div>
		<div class="search-prop">
			<div style="width: 100%; height: 25px; display: block"></div>
		</div>
	</div>
	<div class="container-lr" style="position: relative; left: 160px">
		<div class="colCtnr">
			<div class="col-main" id="colMain-List">
				<ul id="result-list" class="mode-list">
				<c:forEach items="${paginationOffers.list}" var="offerInfo">
					<li data-accid="57887" data-adid="13418691" data-infos="01 44 90 03 94" data-tranid="2">
						<a href="#"   class="picCtnr">
							<div class="product-media">
								<img onerror="ErrorImg(this);" src="${pageContext.request.contextPath}/offerImage?id=${offerInfo.id}" />
							</div>
   						 </a>
						
						
						
						<div class="details ">
							<div class="features">            </div>
				
							<span class="price" name="country">${offerInfo.country}</span>
							<span class="price" name="city">${offerInfo.city}</span>
							<span class="price" name="street">${offerInfo.street}</span>
							<ul>
								<li>${offerInfo.numberOfParts} pièces</li>
								<li>${offerInfo.area} m^2</li>
							</ul>
							<span class="propShortDesc">${offerInfo.description}</span> 
							<div class="links">
							    <a class="mydetail" href="${pageContext.request.contextPath}/detail?id=${offerInfo.id}">Détail</a>
							</div>
							<div class="links">
								<a href="${pageContext.request.contextPath}/contact?id=${offerInfo.id}" class="sendMessage">Contacter</a>
							</div>
						</div>
					</li>
				</c:forEach>	
				
				<br/>
  
			    <c:if test="${paginationOffers.totalPages > 1}">
			        <div class="page-navigator">
			           <c:forEach items="${paginationOffers.navigationPages}" var = "page">
			               <c:if test="${page != -1 }">
			                 <a href="liste?page=${page}" class="nav-item">${page}</a>
			               </c:if>
			               <c:if test="${page == -1 }">
			                 <span class="nav-item"> ... </span>
			               </c:if>
			           </c:forEach>
			            
			        </div>
			    </c:if>
				
				</ul>
				<div id="multilead-form"></div>
				<div id="adcontainerbottom" style="margin: 10px 0"></div>
			</div>
			
			
			
			
			
			<div class="col-side ">
				<div class="lr-pub-top">
				<div id="avlineContainer-ResultList-Top"
						class="side-block ad-block">
						<div class="avLineContent">
							<script charset="ISO-8859-1" type="text/javascript">
								_adsLoader
										.load('http://adnext.fr/richmedia.adv?id=103740&plc=3&w=300&h=250&s=fixed&section=LR,Appartement,Location,dpt75,ile_de_france&ts=');
							</script>
						</div>
					</div>
				</div>
				<div class="lr-pub-bottom">
					<div id="avlineContainer-ResultList-Bottom"
						class="side-block ad-block">
						<div class="avLineContent">
							<script charset="ISO-8859-1" type="text/javascript">
								_adsLoader
										.load('http://adnext.fr/richmedia.adv?id=103740&plc=12&w=300&h=250&s=fixed&section=LR,Appartement,Location,dpt75,ile_de_france&ts=');
							</script>
						</div>
					</div>
				</div>
				<script src="/Shared/ServicesPublicities?v=QDpau2NDjdvRs2PDZLDA33zbBxCSDdo8aQWScImQUTA1"></script>
				<div id="adcontainertop"></div>
			</div>
		</div>
	</div>
	<span class="back-to-top" title="Remonter"></span>
	<div class="pre-footer">
		<div class="wrapper">
			<div class="breadcrumb" id="footer-breadcrumb"></div>
			<div class="bottom-mentions"></div>
		</div>
	</div>
	<footer>
		<div class="footer-brands-wrapper">
			<div class="brands">
				<div class="so-local">
					<a href="http://www.solocalgroup.com/" target="_blank"
						rel="nofollow"></a>
				</div>
				<div class="pages-jaunes">
					<a href="http://www.pagesjaunes.fr/" target="_blank" rel="nofollow">

					</a>
				</div>
				<div class="mappy">
					<a href="http://fr.mappy.com/" target="_blank" rel="nofollow">

					</a>
				</div>
				<div class="comprendre-choisir">
					<a href="https://www.ooreka.fr/" target="_blank" rel="nofollow">
					</a>
				</div>

			</div>
		</div>
	</footer>







	<div id="avlineContainer-ResultList-Habillage" class="">
		<div class="avLineContent"></div>
	</div>

	<div class="hiddenappversion">07/09/2016 17:46:24 - Prod -
		AVAL-FO_001 - v3.4.9.13 - rev 20cb3f1</div>



</body>
</html>
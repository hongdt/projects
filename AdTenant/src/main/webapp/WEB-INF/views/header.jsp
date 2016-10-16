<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="layout">
	<div class="purplegbackground">
		<div class="wrapper">
			<ul class="top-menu">
				<li class="logo"></li>
			</ul>
			<a href="${pageContext.request.contextPath}/" style="position: relative; left: -100px"><img src="${pageContext.request.contextPath}/CSS/logo.png" width="150" height="90"/></a>
		</div>
	</div>
	<div class="bottom-layout normal-header">
		<div class="wrapper"
			style="position: relative; left: 100px; top: -40px">
			<ul class="bottom-menu">

				<li class="sale"><span class="menu-title" id="title_vendre"
					style="font-size: 24px"><a
						href="${pageContext.request.contextPath}/">ACCUEIL</a><span
						class="pic"><span></span></span></span></li>


				<li class="sale"><span class="menu-title" id="title_vendre"
					style="font-size: 24px"><a
						href="${pageContext.request.contextPath}/demande">DEMANDE</a><span
						class="pic"><span></span></span></span></li>
				<li class="finance"><span class="menu-title"
					id="title_financer" style="font-size: 24px"><a
						href="${pageContext.request.contextPath}/offre">OFFRE</a><span
						class="pic"><span></span></span></span></li>
				<li class="move"><span class="menu-title" id="title_demenager"
					style="font-size: 24px"><a
						href="${pageContext.request.contextPath}/inscription">INSCRIPTION</a><span
						class="pic"><span></span></span></span></li>

				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<!-- <li class="move"><span class="menu-title" id="title_demenager"
						style="position: relative; left: 80px; top: -5px"><a
							href="#"><img src="CSS/notification_icon.png"></a><span
							class="pic"><span></span></span></span></li> -->
					<li class="move"><span class="menu-title" id="title_demenager"
						style="position: relative; left: 40px;">
							<a
							href="#"><img src="CSS/notification_icon.png"></a><span></span>
							<a
							href="${pageContext.request.contextPath}/profil">
								${pageContext.request.userPrincipal.name} </a> <a
							href="${pageContext.request.contextPath}/deconnexion"> / DECONNEXION</a><span
							class="pic"><span></span></span></span></li>
					<!-- <li class="move"><span class="menu-title" id="title_demenager"
						style="position: relative; left: 50px;"><a
							href="${pageContext.request.contextPath}/deconnexion">DECONNEXION</a>
							<span class="pic"><span></span></span></span></li> -->
				</c:if>
				<c:if test="${pageContext.request.userPrincipal.name == null}">
					<li class="move"><span class="menu-title" id="title_demenager"
						style="position: relative; left: 100px; font-size: 24px"> <a
							href="${pageContext.request.contextPath}/connexion">SE
								CONNECTER</a><span class="pic"><span></span></span></span></li>
				</c:if>
			</ul>
</nav>
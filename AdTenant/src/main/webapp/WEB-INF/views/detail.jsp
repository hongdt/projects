<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>    
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Détail</title>  
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/css01.css" type=text/css />
    <link href="${pageContext.request.contextPath}/CSS/css02.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/CSS/css03.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/CSS/css04.css" rel="stylesheet"/>
	<script src="${pageContext.request.contextPath}/CSS/js1.js"></script>
    <script type="text/javascript" src="//cdn.tagcommander.com/1146/tc_Avendrealouer_2.js"></script>
    <script type="text/javascript" src="/Scripts/Shared/ads.js"></script>
    <script type="text/javascript" charset="utf-8">
            (function(G,o,O,g,L,e){G[g]=G[g]||function(){(G[g]['q']=G[g]['q']||[]).push(
             arguments)},G[g]['t']=1*new Date;L=o.createElement(O),e=o.getElementsByTagName(
             O)[0];L.async=1;L.src='//www.google.com/adsense/search/async-ads.js';
                e.parentNode.insertBefore(L,e)})(window,document,'script','_googCsa');
    </script>
</head>
<body class="aval fr-fr ProductDetails">
    <div id="headerMarqueBlanche"></div>
    <!-- MENU -->
	<jsp:include page="header.jsp" />
	<div class="s-engine fd">
   		<div class="search-header">
        	<div class="engine">
            	<div class="detailsBackToList"></div>
       		</div>
    	</div>
    </div>
	<div class="page-wrapper">
    <div class="fd-header">
        <div class="fd-title">
            <h1><span class='mainh1'>${offerInfo.nameAdvertise}</span></h1>
        </div>
        <div class="fd-price">
			<div class="price slump">
				<div class="display-price">
                    <p id="fd-price-slump" class="price-slump"></p>
                    <span id="fd-price-val">${offerInfo.price} USD </span>
                    <div></div>
                    <div id="fd-sub-price-links" class="fd-sub-price">
                        <div id="fd-credit-link-ctnr" class="credit"></div>
                    </div>
                </div>
			</div>        
		</div>
    </div>

    
    <div class="main-pane">
        <div class="tabPanel">
            <div id="property-tab-content">
				<div class="topSummary">
    				<div id="bxSliderContainer" class="slideCtnr fd-content-item"  >
       		 			<ul>
                			<li>
                    			<img id="media-fd-0" src="${pageContext.request.contextPath}/offerImage1?id=${offerInfo.id}" alt="" onerror="ErrorImg(this);" />
                			</li>
                			<li>
                    			<img id="media-fd-1" src="${pageContext.request.contextPath}/offerImage2?id=${offerInfo.id}" alt="" onerror="ErrorImg(this);" />
                			</li>
               				<li>
                    			<img id="media-fd-0" src="${pageContext.request.contextPath}/offerImage3?id=${offerInfo.id}" alt="" onerror="ErrorImg(this);" />
                			</li>
        				</ul>
    				</div>
				</div>
				<div class="property-description">
    				<h2>Descriptiion</h2>
    				<div id="fd-top-desc-links" class="fd-top-links-container">
        				<div class="shareContainer"></div>
						<div class="shareForm">
    						<div class="triangle-with-shadow"></div>
    						<div class="cross"></div>
    						<div class="text line">Partager sur :</div>
    						<div class="icones line">
        						<span class="share-facebook link"></span>
        						<span class="share-twitter link"></span>
        						<span class="share-googleplus link"></span>
        						<span data-id="14368587" class="share-email link"></span>
    						</div>
    					<div class="url line">
        					<input class="tbDefault" type="text" name="share-url" id="share-url" disabled="disabled" />
    					</div>
					</div> 
        			<div id="alert-link-property-summary" class="fd-price-alert original">
            			<div class="icon">&nbsp;</div>            
        			</div>
    			</div>
    			<div id="propertyDesc" class="property-description-main" data-tracked-origin="PropertySummary">
       				${offerInfo.description }
    			</div>
    		</div>
		</div>
	</div>
</div>
<div class="right-pane">
        <div class="contact_form_right">
            <div class="pro-details withPic">
                <div class="agency-info">
                    <div>
                            <span title="Agence Bleu Provence Immobilier">Proposé par  </span>
                    </div>
                    <div>
                        <span class="further avalTtip" style="display: inline-block">${offerInfo.email}</span>
                        <span class="further avalTtip" style="display: inline-block">${offerInfo.date}</span>
                    </div>
                </div>
                <div class="contactCtnr phone-available"></div>
          	</div>
           	<hr />
            <div id="contactformhaut" class="phone-available">        
			<form action="${pageContext.request.contextPath}/detail?contact" class="fd-contact-account-top" data-ajax="true" data-ajax-begin="return onSubmitAvalForm(document.getElementById(&#39;contactAccountHaut&#39;), &#39;#bt-contactaccount-prop-1&#39;, canSendContactFromFd);" data-ajax-mode="replace" data-ajax-success="contactAccountHautSuccess()" data-ajax-update="#contactformhaut" id="contactAccountHaut" method="post">	
				<textarea class="tbDefault" cols="20" id="Message" name="Message" placeholder="Votre message" rows="2">
				</textarea>
  				<button id="bt-contactaccount-prop-1" type="submit" class="btnDefault" value="Demander des infos">
  					<span></span>
        			<span>Envoyer un messagerie</span>
    			</button> 
			</form>
            </div>
            	<div class="fd-contact-variance-1" style="display: none;">
          	</div>
        </div>
	</div>
</div>


<span class="back-to-top" title="Remonter"></span>
<footer>
  <div class="footer-brands-wrapper">
        <div class="brands">
            <a href="http://www.solocalgroup.com/" target="_blank" rel="nofollow">
                <div class="so-local"></div>
            </a>
            <a href="http://www.pagesjaunes.fr/" target="_blank" rel="nofollow">
                <div class="pages-jaunes"></div>
            </a>
            <a href="http://fr.mappy.com/" target="_blank" rel="nofollow">
                <div class="mappy"></div>
            </a>
            <a href="https://www.ooreka.fr/" target="_blank" rel="nofollow">
                <div class="comprendre-choisir"></div>
            </a>
        </div>
    </div>
</footer>



    <div class="hiddenappversion">25/07/2016 05:23:22 - Prod - AVAL-FO_002 - v3.4.7.47 - rev 6844edf</div>
  




    <div class="hiddenappversion">17/10/2016 01:00:34 - Prod - AVAL-FO_001 - v3.4.9.150 - rev af932b4</div>
    

    
        
    <script src="http://cdn2.avendrealouer.fr/Properties/Details/scripts-details.js?v=V5xelyPpPK359NnQqIeYcMv1O0uzBpMS5rNtfQbpNzU1"></script>

    
    
        <script>
        window._alertcontext = 'setMinimumValues=true&pageIndex=1&pageSize=25&sortPropertyName=ReleaseDate&sortDirection=Descending&searchTypeID=1&typeGroupCategoryID=1&transactionId=1&localityIds=4-1878&typeGroupIds=2&minimumPrice=189000&minimumSurface=108';window._fdSearchContextPropertyId = '14368587';
    </script>

    
</body>
</html>



<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:include page="main.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
	</head>
	<body>
		<div class="module module-content"> 
			<img class="module-bg" src="img/bg1.png" />
			<div class="content"> 
				<div class="logo"> 
					<i class="icon icon-back" style="background-image: url(img/icon-back.png);"></i>
					<span onclick="location.href='/DMC/index'"><strong>返回</strong></span>
				</div>
				<div class="operate">
				    <i class="icon icon-skin" style="background-image: url(img/icon-skin.png);"></i> 
					<i onclick="location.href='/DMC/feedback'" class="icon icon-message" style="background-image: url(img/icon-message.png);"></i> 
					<i class="icon icon-down" style="background-image: url(img/icon-down.png);"></i> 
					<i onclick="minwin()" class="icon icon-minus" style="background-image: url(img/icon-minus.png);"></i> 
					<i onclick="closewin()" class="icon icon-close" style="background-image: url(img/icon-close.png);"></i> 
				</div>
				<div class="focus-title clearfix">
					<div class="tijian-box" style="background-image: url(img/icon-tijian.png);">88<span class="text-dw">分</span></div>
					<h2>商家存在潜力,建议立即查看</h2>
					<span class="font12"><i class="icon icon-btn-down" style="background-image: url(img/btn-yjxz.png);" onclick="progress()"></i> 重新体验</span>
				</div> 
			</div>
			<div class="border-colorful"></div>
			<div class="analysis-result">
				<div class="inner">
					<ul class="clearfix">
						<li><i class="icon icon-info-red" style="background-image: url(img/info-red.png);"></i>共扫描了678项<span class="split">-</span><span class="text-red strong">8</span>项有潜力</li>
						<li>流量通道<span class="split">-</span>共<a class="text-green strong">70</a>项</li>
						<li>单品数据<span class="split">-</span>共<a class="text-green strong">320</a>项</li>
						<li>产品结构<span class="split">-</span>共<a class="text-green strong">4</a>项</li>
						<li class="last">词汇信息<span class="split">-</span>共<a class="text-green strong">280</a>项</li>
					</ul>
				</div>
			</div>
			<div class="application-list">
				 <ul>
					   <c:forEach items= "${dataList }" var = "processData" varStatus="loop">
						<li>
						<c:choose>
							<c:when test="${fn:startsWith(processData.tb, '-')}">
								<img src="img/img02.png"  id="imgsel${loop.index }"/>
							</c:when>
							
							<c:otherwise>
								<img src="img/img01.png"  id="imgsel${loop.index }"/>
							</c:otherwise>
						</c:choose>
							<%-- <img src="img/img01.png"  id="imgsel${loop.index }"/> --%>
							<p class="title">${processData.sourceDetail }</p>
							<i class="icon icon-btn-download" style="background-image: url(img/icon-btn-download.png);"></i>
							<!-- popup -->
							<div class ="popup", id="popup${loop.index }" style="display:none;">
								<div class="inner">
									<i class="icon icon-arrow-left" style="background-image: url(img/icon-arrow-left.png);"></i>
									<p class="text-box">
										<span class="title">最近三天数据 </span>
										<span>${processData.currentAccessNumChange } </span>
										<span>${processData.previousOneDayAccessNum } </span>
										<span>${processData.previousTwoDayAccessNum } </span>
										<span class="title">最近三天数据 </span>
										<c:choose>
											<c:when test="${fn:startsWith(processData.tb,'-')}">
												<span>同比下降 <span class="text-yellow strong">${processData.tb }</span></span>
											</c:when>
											<c:otherwise>
												<span>同比上升 <span class="text-green strong">${processData.tb }</span></span>
											</c:otherwise>
										</c:choose>
										
										<c:choose>
										     <c:when test="${fn:startsWith(processData.hb,'-')}">
												<span>环比下降 <span class="text-yellow strong">${processData.hb }</span></span>
											</c:when>
											<c:otherwise>
												<span>环比上升 <span class="text-green strong">${processData.hb }</span></span>
											</c:otherwise>
										</c:choose>
									</p>
								</div>
							</div>
						</li>
					</c:forEach>
				</ul>
				
			</div>
		</div>
	</body>
</html>


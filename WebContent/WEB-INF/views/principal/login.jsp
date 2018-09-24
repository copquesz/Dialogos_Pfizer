<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <!-- Site made with Mobirise Website Builder v4.3.4, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="generator" content="Mobirise v4.3.4, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" href="${path}/assets/images/logo-2160x1374.png" type="image/x-icon">
  <meta name="description" content="Website Generator Description">
  <title>Login - Prêmio Pfizer Inovação Social 2018</title>
  <link rel="stylesheet" href="${path}/assets/font-awesome/css/font-awesome.css">
  <link rel="stylesheet" href="${path}/assets/web/mobirise-icons/mobirise-icons.css">
  <link rel="stylesheet" href="${path}/assets/tether/tether.min.css">
  <link rel="stylesheet" href="${path}/assets/soundcloud-plugin/style.css">
  <link rel="stylesheet" href="${path}/assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="${path}/assets/bootstrap/css/bootstrap-grid.min.css">
  <link rel="stylesheet" href="${path}/assets/bootstrap/css/bootstrap-reboot.min.css">
  <link rel="stylesheet" href="${path}/assets/dropdown/css/style.css">
  <link rel="stylesheet" href="${path}/assets/socicon/css/styles.css">
  <link rel="stylesheet" href="${path}/assets/theme/css/style.css">
  <link rel="stylesheet" href="${path}/assets/mobirise/css/mbr-additional.css" type="text/css">
  <link rel="stylesheet" href="${path}/assets/custom/style.css" type="text/css">
  
  
  
</head>
<body>
  
<!-- import menu.jsp -->
<c:import url="../menu/menu-principal.jsp" />


<section class="engine"><a href="https://mobirise.co/g">create your own website</a></section><section class="header12 cid-qBfsih1FIp mbr-fullscreen mbr-parallax-background" id="header12-13" data-rv-view="565">

    

    <div class="mbr-overlay" style="opacity: 0.9; background-color: rgb(0, 32, 96);">
    </div>

    <div class="container">
            <div class="media-container">
                <div class="col-md-12 align-center">
                    <h1 class="mbr-section-title pb-3 mbr-white mbr-bold mbr-fonts-style display-1"><br> <span class="mbr-iconfont fa-user-circle-o fa" media-simple="true"></span></h1>
                                        
                    <div class="col-md-6 offset-md-3" style="border: 1px solid #fff; padding-bottom: 30px;">  

                      <form class="form-horizontal" method="post" action="${path}/login">
                        <div class="form-group">
                          <label class="control-label col-sm-12" for="email"></label>
                          <div class="col-sm-12">
                            <input type="email" class="form-control" id="email" name="email" placeholder="Digite seu email" required>
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="control-label col-sm-12" for="senha"></label>
                          <div class="col-sm-12"> 
                            <input type="password" class="form-control" id="senha" name="senha" placeholder="Digite sua senha" required>
                          </div>
                        </div>                        
                        <div class="row"> 
                          <div class="col-sm-6 offset-sm-3">
                            <button type="submit" class="form-control custom-button-cadastro-inverse">Entrar</button>
                          </div>
                        </div>
                      </form> 

                    </div>                     

                        
                    </div>
                </div>
            </div>
    </div>

    
</section>




  <script src="${path}/assets/web/jquery/jquery.min.js"></script>
  <script src="${path}/assets/popper/popper.min.js"></script>
  <script src="${path}/assets/tether/tether.min.js"></script>
  <script src="${path}/assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="${path}/assets/dropdown/js/script.min.js"></script>
  <script src="${path}/assets/touch-swipe/jquery.touch-swipe.min.js"></script>
  <script src="${path}/assets/jarallax/jarallax.min.js"></script>
  <script src="${path}/assets/smooth-scroll/smooth-scroll.js"></script>
  <script src="${path}/assets/theme/js/script.js"></script>
  <script src="${path}/assets/custom/script.js"></script>
    
</body>
</html>
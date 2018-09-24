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
  <link rel="shortcut icon" href="assets/images/logo-2160x1374.png" type="image/x-icon">
  <meta name="description" content="Website Generator Description">
  <title>Login - Prêmio Pfizer Inovação Social 2018</title>
  <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css">
  <link rel="stylesheet" href="assets/web/assets/mobirise-icons/mobirise-icons.css">
  <link rel="stylesheet" href="assets/tether/tether.min.css">
  <link rel="stylesheet" href="assets/soundcloud-plugin/style.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-grid.min.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-reboot.min.css">
  <link rel="stylesheet" href="assets/dropdown/css/style.css">
  <link rel="stylesheet" href="assets/socicon/css/styles.css">
  <link rel="stylesheet" href="assets/theme/css/style.css">
  <link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">
  <link rel="stylesheet" href="assets/custom/style.css" type="text/css">
  
  
  
</head>
<body>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="background-color: rgba(255, 255, 0, 0.1); text-align: center;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">LOGIN INCORRETO</h4>
        </div>
        <div class="modal-body">
          <p><b>Não foi possível efetuar o login!</b></p>
          <p>Verifique o e-mail e/ou senha digitado.</p>
          <br><p>Caso esteja com dificuldade para acessar a plataforma, você pode solicitar o suporte através do contato abaixo:
          <ul><li><b>Telefone:</b> (11) 2389-5766 - das 10 às 17 horas</li><li><b>E-mail:</b> premiopfizer@yabaconsultoria.com.br</li></ul>      
        </div>
        <div class="modal-footer">
          <button type="button" class="" data-dismiss="modal">Ok</button>
        </div>
      </div>
      
    </div>
  </div>
  
<c:import url="menu.jsp" />

<section class="engine"><a href="https://mobirise.co/g">create your own website</a></section><section class="header12 cid-qBfsih1FIp mbr-fullscreen mbr-parallax-background" id="header12-13" data-rv-view="565">

    

    <div class="mbr-overlay" style="opacity: 0.9; background-color: rgb(0, 32, 96);">
    </div>

    <div class="container">
            <div class="media-container">
                <div class="col-md-12 align-center">
                    <h1 class="mbr-section-title pb-3 mbr-white mbr-bold mbr-fonts-style display-1"><br> <span class="mbr-iconfont fa-user-circle-o fa" media-simple="true"></span></h1>
                                        
                    <div class="col-md-6 offset-md-3" style="border: 1px solid #fff; padding-bottom: 30px;">  

                      <form class="form-horizontal" method="post" action="action.do">
                        <div class="form-group">
                          <label class="control-label col-sm-12" for="email"></label>
                          <div class="col-sm-12">
                            <input type="email" class="form-control" id="email" name="email" placeholder="Digite seu email" required>
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="control-label col-sm-12" for="pwd"></label>
                          <div class="col-sm-12"> 
                            <input type="password" class="form-control" id="senha" name="senha" placeholder="Digite sua senha" required>
                          </div>
                        </div>                        
                        <div class="row"> 
                          <div class="col-sm-6 offset-sm-3">
                            <button type="submit" class="form-control custom-button-cadastro-inverse" name="command" value="FazerLogin">Entrar</button>
                          </div>
                        </div>
                      </form> 

                    </div>                     

                        
                    </div>
                </div>
            </div>
    </div>

    
</section>




  <script src="assets/web/assets/jquery/jquery.min.js"></script>
  <script src="assets/popper/popper.min.js"></script>
  <script src="assets/tether/tether.min.js"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/dropdown/js/script.min.js"></script>
  <script src="assets/touch-swipe/jquery.touch-swipe.min.js"></script>
  <script src="assets/jarallax/jarallax.min.js"></script>
  <script src="assets/smooth-scroll/smooth-scroll.js"></script>
  <script src="assets/theme/js/script.js"></script>
  <script src="assets/custom/script.js"></script>

  <script type="text/javascript">
    $(document).ready(function() {
     $('#myModal').modal('show');
    });
  </script>
  
  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="icon" type="image/png" sizes="16x16" href="/resources/plugins/images/favicon.png">
    <title>Дополнительное образование</title>
    <!-- Bootstrap Core CSS -->
    <link href="/resources/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- toast CSS -->
    <link href="/resources/plugins/bower_components/toast-master/css/jquery.toast.css" rel="stylesheet">
    <!-- animation CSS -->
    <link href="/resources/css/animate.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="/resources/css/style.css" rel="stylesheet">
    <!-- color CSS -->
    <link href="/resources/css/colors/blue.css" id="theme"  rel="stylesheet">
    <link href="/resources/plugins/bower_components/sweetalert/sweetalert.css" rel="stylesheet" type="text/css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

</head>
<body>
<!-- Preloader -->

<section id="wrapper" class="login-register">

    <div class="login-box">
        <div class="white-box">

            <form class="form-horizontal form-material" id="loginform" action="LoginServlet">
                <h3 class="box-title m-b-20">Вход в систему</h3>
                <div class="form-group ">
                    <div class="col-xs-12">
                        <input name="login" class="form-control" type="text" required autofocus placeholder="Логин">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-xs-12">
                        <input name="password" class="form-control" type="password" required placeholder="Пароль">
                    </div>
                </div>
                <div class="form-group text-center m-t-20">
                    <div class="col-xs-12">
                        <button class="btn btn-info btn-lg btn-block text-uppercase waves-effect waves-light" type="submit">Авторизация</button>
                    </div>

                </div>
            </form>

        </div>
    </div>
</section>
<!-- jQuery -->
<script src="/resources/plugins/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="/resources/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Menu Plugin JavaScript -->
<script src="/resources/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>

<!--slimscroll JavaScript -->
<script src="/resources/js/jquery.slimscroll.js"></script>
<!--Wave Effects -->
<script src="/resources/js/waves.js"></script>
<script src="/resources/plugins/bower_components/toast-master/js/jquery.toast.js"></script>
<script src="/resources/js/toastr.js"></script>
<script type="text/javascript">
    //Alerts
    $(".myadmin-alert .closed").click(function (event) {
        $(this).parents(".myadmin-alert").fadeToggle(350);
        return false;
    });
    /* Click to close */
    $(".myadmin-alert-click").click(function (event) {
        $(this).fadeToggle(350);
        return false;
    });
    $(".showtop").click(function () {
        $(".alerttop").fadeToggle(350);
    });
    $(".showtop2").click(function () {
        $(".alerttop2").fadeToggle(350);
    });
    /** Alert Position Bottom  **/
    $(".showbottom").click(function () {
        $(".alertbottom").fadeToggle(350);
    });
    $(".showbottom2").click(function () {
        $(".alertbottom2").fadeToggle(350);
    });
    /** Alert Position Top Left  **/
    $("#showtopleft").click(function () {
        $("#alerttopleft").fadeToggle(350);
    });
    /** Alert Position Top Right  **/
    $("#showtopright").click(function () {
        $("#alerttopright").fadeToggle(350);
    });
    /** Alert Position Bottom Left  **/
    $("#showbottomleft").click(function () {
        $("#alertbottomleft").fadeToggle(350);
    });
    /** Alert Position Bottom Right  **/
    $("#showbottomright").click(function () {
        $("#alertbottomright").fadeToggle(350);
    });
</script>
<!-- Custom Theme JavaScript -->
<script src="/resources/js/custom.min.js"></script>

<!--Style Switcher -->
<script src="/resources/plugins/bower_components/styleswitcher/jQuery.style.switcher.js"></script>
</body>
</html>

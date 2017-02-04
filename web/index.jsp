<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">
  <link rel="icon" type="image/png" sizes="16x16" href="/resources/plugins/images/favicon.png">
  <title>Главная страница - Дополнительное образование</title>
  <!-- Bootstrap Core CSS -->
  <link href="/resources/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
  <!-- Menu CSS -->
  <link href="/resources/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" rel="stylesheet">
  <!-- Morris CSS -->
  <link href="/resources/plugins/bower_components/morrisjs/morris.css" rel="stylesheet">
  <!-- animation CSS -->
  <link href="/resources/css/animate.css" rel="stylesheet">
  <!-- Custom CSS -->
  <link href="/resources/css/style.css" rel="stylesheet">
  <!-- color CSS -->
  <link href="/resources/css/colors/blue.css" id="theme" rel="stylesheet">
  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->

</head>

<body>

<!-- Preloader -->
<div class="preloader">
  <div class="cssload-speeding-wheel"></div>
</div>
<div id="wrapper">
  <!-- Navigation -->
  <nav class="navbar navbar-default navbar-static-top m-b-0">
    <div class="navbar-header"> <a class="navbar-toggle hidden-sm hidden-md hidden-lg " href="javascript:void(0)" data-toggle="collapse" data-target=".navbar-collapse"><i class="ti-menu"></i></a>
      <div class="top-left-part"><a class="logo" href="index.html"><b><img src="/resources/plugins/images/eliteadmin-logo.png" alt="home" /></b><span class="hidden-xs"><strong>Доп</strong>образование</span></a></div>
      <ul class="nav navbar-top-links navbar-left hidden-xs">
        <li><a href="javascript:void(0)" class="open-close hidden-xs waves-effect waves-light"><i class="icon-arrow-left-circle ti-menu"></i></a></li>
      </ul>

    </div>
    <!-- /.navbar-header -->
    <!-- /.navbar-top-links -->
    <!-- /.navbar-static-side -->
  </nav>
  <!-- Left navbar-header -->
  <div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse slimscrollsidebar">
      <ul class="nav" id="side-menu">
        <li class="sidebar-search hidden-sm hidden-md hidden-lg">
          <!-- input-group -->
          <div class="input-group custom-search-form">
            <input type="text" class="form-control" placeholder="Search/resources."> <span class="input-group-btn">
                            <button class="btn btn-default" type="button"> <i class="fa fa-search"></i> </button>
                            </span> </div>
          <!-- /input-group -->
        </li>
        <li class="user-pro">
          <a href="#" class="waves-effect"><img src="/resources/plugins/images/users/1.jpg" alt="user-img" class="img-circle"> <span class="hide-menu">Prof. Steve Gection<span class="fa arrow"></span></span>
          </a>
          <ul class="nav nav-second-level">
            <li><a href="javascript:void(0)"><i class="ti-user"></i>  Мой профиль</a></li>
            <li><a href="javascript:void(0)"><i class="ti-settings"></i>  Настройки профиля</a></li>
            <li><a href="login.html"><i class="fa fa-power-off"></i>  Выход</a></li>
          </ul>
        </li>
              <li class="nav-small-cap m-t-10">--- Инструменты</li>
        <li> <a href="events.html" class="waves-effect"><i class="ti-calendar p-r-10"></i> <span class="hide-menu">Расписания</span></a> </li>
        <li> <a href="javascript:void(0);" class="waves-effect"><i class="icon-people p-r-10"></i> <span class="hide-menu"> Преподаватели <span class="fa arrow"></span></span></a>
          <ul class="nav nav-second-level">
            <li> <a href="professors.html">Все преподаватели</a> </li>
            <li> <a href="add-professor.html">Добавить преподавателя</a> </li>
            <li> <a href="edit-professor.html">Редактировтаь преподавателя</a> </li>
          </ul>
        </li>
        <li> <a href="javascript:void(0);" class="waves-effect"><i class="fa fa-graduation-cap p-r-10"></i> <span class="hide-menu"> Студенты <span class="fa arrow"></span></span></a>
          <ul class="nav nav-second-level">
            <li> <a href="students.html">Все студенты</a> </li>
            <li> <a href="add-student.html">Добавить студента</a> </li>
            <li> <a href="edit-student.html">Редактировать студента</a> </li>
          </ul>
        </li>
        <li> <a href="javascript:void(0);" class="waves-effect"><i class="fa fa-bars p-r-10"></i> <span class="hide-menu"> Курсы <span class="fa arrow"></span></span></a>
          <ul class="nav nav-second-level">
            <li> <a href="courses.html">Все курсы</a> </li>
            <li> <a href="/addcourse.jsp">Добавить курс</a> </li>
            <li> <a href="edit-course.html">Редактировать курс</a> </li>
          </ul>
        </li>
               <li> <a href="javascript:void(0);" class="waves-effect"><i class="icon-chart p-r-10"></i> <span class="hide-menu"> Отчеты <span class="fa arrow"></span></span></a>
          <ul class="nav nav-second-level">
            <li> <a href="general-report.html">Основные отчеты</a></li>
            <li> <a href="income-report.html">Income Report</a></li>
            <li> <a href="expense-report.html">Expense Report</a></li>
          </ul>
        </li>
        <li class="nav-small-cap m-t-10">--- Support</li>
        <li> <a href="#" class="waves-effect"><i data-icon="/" class="linea-icon linea-basic fa-fw"></i> <span class="hide-menu">UI Elements<span class="fa arrow"></span> <span class="label label-rouded label-info pull-right">13</span> </span></a>
          <ul class="nav nav-second-level">
            <li><a href="panels-wells.html">Panels and Wells</a></li>
            <li><a href="panel-ui-block.html">Panels With BlockUI</a></li>
            <li><a href="buttons.html">Buttons</a></li>
            <li><a href="sweatalert.html">Sweat alert</a></li>
            <li><a href="typography.html">Typography</a></li>
            <li><a href="grid.html">Grid</a></li>
            <li><a href="tabs.html">Tabs</a></li>
            <li><a href="tab-stylish.html">Stylish Tabs</a></li>
            <li><a href="modals.html">Modals</a></li>
            <li><a href="progressbars.html">Progress Bars</a></li>
            <li><a href="notification.html">Notifications</a></li>
            <li><a href="carousel.html">Carousel</a></li>
            <li><a href="list-style.html">List & Media object</a></li>
            <li><a href="user-cards.html">User Cards</a></li>
            <li><a href="timeline.html">Timeline</a></li>
            <li><a href="timeline-horizontal.html">Horizontal Timeline</a></li>
            <li><a href="nestable.html">Nesteble</a></li>
            <li><a href="range-slider.html">Range Slider</a></li>
            <li><a href="bootstrap.html">Bootstrap UI</a></li>
            <li><a href="tooltip-stylish.html">Stylish Tooltips</a></li>
          </ul>
        </li>
        <li> <a href="#" class="waves-effect"><i data-icon="7" class="linea-icon linea-basic fa-fw"></i> <span class="hide-menu">Icons<span class="fa arrow"></span></span></a>
          <ul class="nav nav-second-level">
            <li> <a href="fontawesome.html">Font awesome</a> </li>
            <li> <a href="themifyicon.html">Themify Icons</a> </li>
            <li> <a href="simple-line.html">Simple line Icons</a> </li>
            <li><a href="linea-icon.html">Linea Icons</a></li>
            <li><a href="weather.html">Weather Icons</a></li>
          </ul>
        </li>
        <li> <a href="widgets.html" class="waves-effect"><i data-icon="P" class="linea-icon linea-basic fa-fw"></i> <span class="hide-menu">Widgets</span></a> </li>
        <li><a href="login.html" class="waves-effect"><i class="icon-logout fa-fw"></i> <span class="hide-menu">Log out</span></a></li>
      </ul>

    </div>
  </div>
  <!-- Left navbar-header end -->
  <!-- Page Content -->
  <div id="page-wrapper">
    <div class="container-fluid">
      <div class="row bg-title">
        <!-- /.col-lg-12 -->
      </div>
      <div class="row">
        <jsp:include page="/ShowMeSubjectList" />
        <c:forEach items="${FSubjects}" var="subject">

          <div class="col-md-3 col-xs-12 col-sm-6">
            <img class="img-responsive" alt="user" src="/resources/plugins/images/big/c2.jpg">
            <div class="white-box">
              <h4><c:out value="${subject.subject_name}" /></h4>
              <p><span><i class="ti-alarm-clock"></i> Длительность: <c:out value="${subject.duration}" /></span></p>
              <p><span><i class="ti-user"></i> Преподаватель: <c:out value="${subject.lecturer_id}" /></span></p>
              <p><span><i class="fa fa-graduation-cap"></i> Направление: <c:out value="${subject.direction_id}" /></span></p>
              <p><span><i class="fa fa-rub"></i> Стоимость: <c:out value="${subject.price}" /></span></p>
              <button class="btn btn-success btn-rounded waves-effect waves-light m-t-10">Подробнее</button>
            </div>
          </div>
        </c:forEach>
      </div>
      <!-- .right-sidebar -->
      <div class="right-sidebar">
        <div class="slimscrollright">
          <div class="rpanel-title"> Service Panel <span><i class="ti-close right-side-toggle"></i></span> </div>
          <div class="r-panel-body">
            <ul>
              <li><b>Layout Options</b></li>
              <li>
                <div class="checkbox checkbox-info">
                  <input id="checkbox1" type="checkbox" class="fxhdr">
                  <label for="checkbox1"> Fix Header </label>
                </div>
              </li>
              <li>
                <div class="checkbox checkbox-warning">
                  <input id="checkbox2" type="checkbox" class="fxsdr">
                  <label for="checkbox2"> Fix Sidebar </label>
                </div>
              </li>
              <li>
                <div class="checkbox checkbox-success">
                  <input id="checkbox4" type="checkbox" class="open-close">
                  <label for="checkbox4"> Toggle Sidebar </label>
                </div>
              </li>
            </ul>
            <ul id="themecolors" class="m-t-20">
              <li><b>With Light sidebar</b></li>
              <li><a href="javascript:void(0)" theme="default" class="default-theme">1</a></li>
              <li><a href="javascript:void(0)" theme="green" class="green-theme">2</a></li>
              <li><a href="javascript:void(0)" theme="gray" class="yellow-theme">3</a></li>
              <li><a href="javascript:void(0)" theme="blue" class="blue-theme working">4</a></li>
              <li><a href="javascript:void(0)" theme="purple" class="purple-theme">5</a></li>
              <li><a href="javascript:void(0)" theme="megna" class="megna-theme">6</a></li>
              <li><b>With Dark sidebar</b></li>
              <br/>
              <li><a href="javascript:void(0)" theme="default-dark" class="default-dark-theme">7</a></li>
              <li><a href="javascript:void(0)" theme="green-dark" class="green-dark-theme">8</a></li>
              <li><a href="javascript:void(0)" theme="gray-dark" class="yellow-dark-theme">9</a></li>
              <li><a href="javascript:void(0)" theme="blue-dark" class="blue-dark-theme">10</a></li>
              <li><a href="javascript:void(0)" theme="purple-dark" class="purple-dark-theme">11</a></li>
              <li><a href="javascript:void(0)" theme="megna-dark" class="megna-dark-theme">12</a></li>
            </ul>
            <ul class="m-t-20 chatonline">
              <li><b>Chat option</b></li>
              <li>
                <a href="javascript:void(0)"><img src="/resources/plugins/images/users/varun.jpg" alt="user-img" class="img-circle"> <span>Varun Dhavan <small class="text-success">online</small></span></a>
              </li>
              <li>
                <a href="javascript:void(0)"><img src="/resources/plugins/images/users/genu.jpg" alt="user-img" class="img-circle"> <span>Genelia Deshmukh <small class="text-warning">Away</small></span></a>
              </li>
              <li>
                <a href="javascript:void(0)"><img src="/resources/plugins/images/users/ritesh.jpg" alt="user-img" class="img-circle"> <span>Ritesh Deshmukh <small class="text-danger">Busy</small></span></a>
              </li>
              <li>
                <a href="javascript:void(0)"><img src="/resources/plugins/images/users/arijit.jpg" alt="user-img" class="img-circle"> <span>Arijit Sinh <small class="text-muted">Offline</small></span></a>
              </li>
              <li>
                <a href="javascript:void(0)"><img src="/resources/plugins/images/users/govinda.jpg" alt="user-img" class="img-circle"> <span>Govinda Star <small class="text-success">online</small></span></a>
              </li>
              <li>
                <a href="javascript:void(0)"><img src="/resources/plugins/images/users/hritik.jpg" alt="user-img" class="img-circle"> <span>John Abraham<small class="text-success">online</small></span></a>
              </li>
              <li>
                <a href="javascript:void(0)"><img src="/resources/plugins/images/users/john.jpg" alt="user-img" class="img-circle"> <span>Hritik Roshan<small class="text-success">online</small></span></a>
              </li>
              <li>
                <a href="javascript:void(0)"><img src="/resources/plugins/images/users/pawandeep.jpg" alt="user-img" class="img-circle"> <span>Pwandeep rajan <small class="text-success">online</small></span></a>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <!-- /.right-sidebar -->
    </div>
    <!-- /.container-fluid -->
    <footer class="footer text-center"> 2016 &copy; Elite Admin brought to you by themedesigner.in </footer>
  </div>
  <!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->
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
<!--Morris JavaScript -->
<script src="/resources/plugins/bower_components/raphael/raphael-min.js"></script>
<script src="/resources/plugins/bower_components/morrisjs/morris.js"></script>
<!-- Sparkline chart JavaScript -->
<script src="/resources/plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js"></script>
<script src="/resources/plugins/bower_components/jquery-sparkline/jquery.charts-sparkline.js"></script>
<!-- Custom Theme JavaScript -->
<script src="/resources/js/custom.min.js"></script>
<script src="/resources/js/dashboard1.js"></script>
<!--Style Switcher -->
<script src="/resources/plugins/bower_components/styleswitcher/jQuery.style.switcher.js"></script>
</body>
</html>
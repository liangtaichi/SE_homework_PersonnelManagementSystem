<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=drive-width,initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
<<<<<<< HEAD

    <!-- 引入vue-->
    <script src="https://cdn.jsdelivr.net/npm/vue"></script>
    <!-- 引入样式 -->
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <!-- 引入组件库 -->
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
    <!--link rel="stylesheet" href="login.css"-->
=======
>>>>>>> 2acfbb97142aa5b385961ece1a31a7e01c60011d
    <!-- font-awesome 图标字体 http://www.fontawesome.com.cn/faicons/#web-application -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" media="screen" rel="stylesheet" type="text/css">
    <title>登录页面</title>
</head>
<div id="login-box">
    <h1>欢迎使用人事管理系统</h1>
    <div class="form">
        <div class="item">
            <i class="fa fa-user-circle-o" aria-hidden="true"></i>
            <input type="text" placeholder="员工工号">
        </div>
        <div class="item">
            <i class="fa fa-key" aria-hidden="true"></i>
            <input type="text" placeholder="密码">
        </div>
        <div>
            <i>你是：</i>
            <i>
                <input type="radio" name="name" checked="checked"/>员工
                <input type="radio" name="name"/>管理员
            </i>
        </div>
    </div>
    <button>登录</button>
</div>
<body>
</body>
</html>


<style>
body{
    background-color:  whitesmoke;
    background-repeat: no-repeat;
    background-size: 100% auto;
}
#login-box{
    width: 30%;
    height: auto;
    margin: 0 auto;
    margin-top: 15%;
    text-align: center;
    background: #00000060;
    padding: 20px 50px;
}
#login-box h1{
    color: #444444 ;
}
#login-box .form .item input{
    margin-top: 15px;
}
#login-box .form i{
    font-size: 18px;
    color: #fff;
}
#login-box .form .item input {
    width: 180px;
    font-size: 18px;
    border: 0;
    border-bottom: 2px solid#fff;
    padding: 5px 10px;
    background:#ffffff00;
    color: #fff;
}
#login-box button{
    margin-top: 15px;
    width: 180px;
    height: 30px;
    font-size: 20px;
    font-weight: 700;
    color: #fff;
    background:linear-gradient(to right,#B0C4DE   0%, #00BFFF 100%);
    border: 0;
    border-radius: 15px;
}  
</style>

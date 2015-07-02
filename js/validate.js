$(document).ready(function(){
        var jVal = {
				'login' : function() {
                        $('body').append('<div id="loginInfo" class="info"></div>');
                        var loginInfo = $('#loginInfo');
                        var ele = $('#login');
                        var pos = ele.offset();
                        loginInfo.css({
                                top: pos.top-3,
                                left: pos.left+ele.width()+15
                        });
                        if(ele.val().length < 6) {
                                jVal.errors = true;
                                        loginInfo.removeClass('correct').addClass('error').html('← должно быть больше 6 символов').show();
                                        ele.removeClass('normal').addClass('wrong');
                        } else {
                                        loginInfo.removeClass('error').addClass('correct').html('√').show();
                                        ele.removeClass('wrong').addClass('normal');
                        }
                },
				'password' : function() {
                        $('body').append('<div id="passwordInfo" class="info"></div>');
                        var passwordInfo = $('#passwordInfo');
                        var ele = $('#password');
                        var pos = ele.offset();
                        passwordInfo.css({
                                top: pos.top-3,
                                left: pos.left+ele.width()+15
                        });
                        if(ele.val().length < 6) {
                                jVal.errors = true;
                                        passwordInfo.removeClass('correct').addClass('error').html('← должно быть больше 6 символов').show();
                                        ele.removeClass('normal').addClass('wrong');
                        } else {
                                        passwordInfo.removeClass('error').addClass('correct').html('√').show();
                                        ele.removeClass('wrong').addClass('normal');
                        }
                },
				'confirmPass' : function() {
                        $('body').append('<div id="confirmPassInfo" class="info"></div>');
                        var confirmPassInfo = $('#confirmPassInfo');
                        var ele = $('#confirmPass');
						var elePass = $('#password');
                        var pos = ele.offset();
                        confirmPassInfo.css({
                                top: pos.top-3,
                                left: pos.left+ele.width()+15
                        });
						/*alert(ele.val().toString());
						alert(elePass.val().toString());*/
                        if(ele.val().toString() != elePass.val().toString()) {
                                jVal.errors = true;
                                        confirmPassInfo.removeClass('correct').addClass('error').html('← пароли не совпадают').show();
                                        ele.removeClass('normal').addClass('wrong');
                        } else {
                                        confirmPassInfo.removeClass('error').addClass('correct').html('√').show();
                                        ele.removeClass('wrong').addClass('normal');
                        }
                },
                'fullName' : function() {
                        $('body').append('<div id="nameInfo" class="info"></div>');
                        var nameInfo = $('#nameInfo');
                        var ele = $('#fullname');
                        var pos = ele.offset();
                        nameInfo.css({
                                top: pos.top-3,
                                left: pos.left+ele.width()+15
                        });
						
                        if(ele.val().length < 5) {
                                jVal.errors = true;
                                        nameInfo.removeClass('correct').addClass('error').html('← должно быть больше 6 символов').show();
                                        ele.removeClass('normal').addClass('wrong');
                        } else {
                                        nameInfo.removeClass('error').addClass('correct').html('√').show();
                                        ele.removeClass('wrong').addClass('normal');
                        }
                },
                'birthDate' : function (){
                        $('body').append('<div id="birthInfo" class="info"></div>');
                        var birthInfo = $('#birthInfo');
                        var ele = $('#birthday');
                        var pos = ele.offset();
                        birthInfo.css({
                                top: pos.top-3,
                                left: pos.left+ele.width()+15
                        });
                        var patt = /^[0-9]{2}\-[0-9]{2}\-[0-9]{4}$/i;
                        if(!patt.test(ele.val())) {
                                jVal.errors = true;
                                        birthInfo.removeClass('correct').addClass('error').html('← введите дату в правильном формате').show();
                                        ele.removeClass('normal').addClass('wrong');
                        } else {
                                        birthInfo.removeClass('error').addClass('correct').html('√').show();
                                        ele.removeClass('wrong').addClass('normal');
                        }
                },
                'gender' : function (){
                        $('body').append('<div id="genderInfo" class="info"></div>');
                        var genderInfo = $('#genderInfo');
                        var ele = $('#woman');
                        var pos = ele.offset();
                        genderInfo.css({
                                top: pos.top-10,
                                left: pos.left+ele.width()+60
                        });
                        if($('input[name="gender"]:checked').length === 0) {
                                jVal.errors = true;
                                        genderInfo.removeClass('correct').addClass('error').html('← вы мужчина или женщина?').show();
                                        ele.removeClass('normal').addClass('wrong');
                        } else {
                                        genderInfo.removeClass('error').addClass('correct').html('√').show();
                                        ele.removeClass('wrong').addClass('normal');
                        }
                },
                
                'email' : function() {
                        $('body').append('<div id="emailInfo" class="info"></div>');
                        var emailInfo = $('#emailInfo');
                        var ele = $('#email');
                        var pos = ele.offset();
                        emailInfo.css({
                                top: pos.top-3,
                                left: pos.left+ele.width()+15
                        });
                        var patt = /^.+@.+[.].{2,}$/i;
                        if(!patt.test(ele.val())) {
                                jVal.errors = true;
                                        emailInfo.removeClass('correct').addClass('error').html('← введите валидный адрес').show();
                                        ele.removeClass('normal').addClass('wrong');
                        } else {
                                        emailInfo.removeClass('error').addClass('correct').html('√').show();
                                        ele.removeClass('wrong').addClass('normal');
                        }
                },
                'about' : function() {
                        $('body').append('<div id="aboutInfo" class="info"></div>');
                        var aboutInfo = $('#aboutInfo');
                        var ele = $('#about');
                        var pos = ele.offset();
                        aboutInfo.css({
                                top: pos.top-3,
                                left: pos.left+ele.width()+15
                        });
                       /* if(ele.val().length < 75) {
                                jVal.errors = true;
                                        aboutInfo.removeClass('correct').addClass('error').html('← come on, tell me a little bit more!').show();
                                        ele.removeClass('normal').addClass('wrong').css({'font-weight': 'normal'});
                        } else {
                                        aboutInfo.removeClass('error').addClass('correct').html('√').show();
                                        ele.removeClass('wrong').addClass('normal');
                        }*/
                },
                'sendIt' : function (){
                        if(!jVal.errors) {
                                $('#jform').submit();
                        }
                }
        };
// ====================================================== //
        $('#send').click(function (){
                var obj = $.browser.webkit ? $('body') : $('html');
                obj.animate({ scrollTop: $('#jform').offset().top }, 750, function (){
                        jVal.errors = false;
						jVal.login();
						jVal.password();
						jVal.confirmPass();
						jVal.email();
                        jVal.fullName();
                        jVal.birthDate();
                        jVal.gender();
                        
                        
                        jVal.about();
                        jVal.sendIt();
                });
                return false;
        });
		$('#login').change(jVal.login);
		$('#password').change(jVal.password);
		$('#confirmPass').change(jVal.confirmPass);
        $('#fullname').change(jVal.fullName);
        $('#birthday').change(jVal.birthDate);
        $('input[name="gender"]').change(jVal.gender);
        $('input[name="vehicle"]').change(jVal.vehicle);
        $('#email').change(jVal.email);
        $('#about').change(jVal.about);
});



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <div class="container">
            <div class="row">
                <div class="text-center center-block" style="width: 300px">
                    <div>
                        <script type="text/javascript">
                           
                                alert("it is working!");
                           
                        </script>
                       <div id="contentRegistration" class="form-group">
                           <form id="jform" action="<c:url value="/user/registered" />" method="post" >
				<fieldset>
                                    <legend>Login Options</legend>
                                    <p>
                                        <label for="login" class="block">Input login <small>(min 6 Char)</small>:</label>
                                        <input type="text" name="login" id="login" class="form-control" />
                                    </p>
                                    <p>
                                        <label for="password" class="block">Input password <small>(min 6 Char)</small>:</label>
                                        <input type="password" name="password" id="password" class="form-control"  />
                                    </p>
                                    <p>
                                        <label for="confirmPass" class="block">Confirm password:</label>
                                        <input type="password" name="confirmPass" id="confirmPass" class="form-control"  />
                                    </p>
                                </fieldset>
                                
				<fieldset>
                                    <legend>Email</legend>
                                    <p>
                                        <label for="email" class="block">Email <small>(pupkin@gmail.com)</small>:</label>
                                        <input type="text" name="email" id="email" class="form-control" />
                                    </p>
                                </fieldset>
                                
                                <fieldset>
                                    <legend>Personal information</legend>
                                    <p>
                                        <label for="fullname" class="block">Enter your first and last name<small>(min 5 Char)</small>:</label>
                                        <input type="text" name="fullname" id="fullname" class="form-control" />
                                    </p>
                                    <p>
                                        <label for="birthday" class="block">Enter your birthday<small>(dd-mm-yyyy)</small>:</label>
                                        <input type="text" name="birthday" id="birthday" class="form-control" />
                                    </p>
                                </fieldset>
                
                                    <p>
                                        <button type="submit" class="btn btn-success" id="send" >Registration</button>
                                    </p>
                            </form>
                        <div>
                    </div>
                </div>
            </div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>
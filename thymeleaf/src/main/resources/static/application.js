    $(document).on("click",".btn",function () {
        alert("Hello !! " + $(".text1").val())

    });




    // Ques 7: Make a web page to show server time using ajax call.
    $(document).ready(function () {

        function getTime() {
            $.ajax({
                url: "/updateTime",
                method: "GET",
                timeout: 1000,
                success: function (data) {
                    $('#timer').html(data);
                    window.setTimeout(getTime, 1000)
                }
            });
        }
        getTime();

//  Ques 10: Add loader in registration form submission which renders load till server return success form submission response
        $("form#login-form").submit(function () {
            $.ajax({
                url: "/login",
                method: "GET",
                success:function success(success) {
                    console.log(success);
                },
                beforeSend: function(){
                    $("#loader").show();
                },
                complete:function(){
                    $("#loader").hide();
                }
            });
        });


    });



var validator = null;
$(window).load(function() {
	validator = $("form").validate({
		groups : {
			name : "email1 email2"
		},
		rules : {
			email1 : "required email",
			email2 : "required email",
			email3 : "required email"
		}
	});
}); 

test("hello test", function() {
	ok(1 == "1", "Passed!");
});

test("jquery validate custom focusout test", function() {
	validateAgainstGroup(null, null);
	ok(true, "null values are handled");
	validateAgainstGroup(null, $.validator.defaults);
	ok(true, "null values are handled");
	validateAgainstGroup($("#email1")[0], null);
	ok(true, "null values are handled");
	//no error before invoking validation
	ok($(".error").length==0 || $(".error").is(":visible")==false, "no error on the page");
	
	//error after invoking validation
	$('#email1').val("testInvalidEmail");
	$('#email2').val("testValidEmail2@email.com");
	validateAgainstGroup($("#email2")[0], validator);
	ok($(".error").length>0 && $(".error").is(":visible")==true, "error on the page");
	
	//no error after correcting error
	$('#email1').val("testValidEmail@email.com");
	validateAgainstGroup($("#email2")[0], validator);
	ok($(".error").length==0 || $(".error").is(":visible")==false, "no error on the page");
	
	//error again after another element becomes error
	$('#email2').val("testInvalidEmail2");
	validateAgainstGroup($("#email2")[0], validator);
	ok($(".error").length>0 && $(".error").is(":visible")==true, "error on the page");
	
	//still error as both elements contain errors
	$('#email1').val("testInvalidEmail");
	validateAgainstGroup($("#email2")[0], validator);
	ok($(".error").length>0 && $(".error").is(":visible")==true, "error on the page");
	
	//error gone after fixing both
	$('#email1').val("testValidEmail@email.com");
	$('#email2').val("testValidEmail2@email.com");
	validateAgainstGroup($("#email2")[0], validator);
	ok($(".error").length==0 || $(".error").is(":visible")==false, "no error on the page");
	
	//error gone after fixing both
	$('#email1').val("testInvalidEmail");
	validateAgainstGroup($("#email2")[0], validator);
	ok($(".error").length>0 && $(".error").is(":visible")==true, "error on the page");
	
	//reset to make email1 and email2 group has no error
	$('#email1').val("testValidEmail@email.com");
	validateAgainstGroup($("#email2")[0], validator);
	ok($(".error").length==0 || $(".error").is(":visible")==false, "no error on the page");
	
	//error for email3
	$('#email3').val("testInvalidEmail");
	validateAgainstGroup($("#email3")[0], validator);
	ok($(".error").length>0 && $(".error").is(":visible")==true, "error on the page");
	
	//reset email3
	$('#email3').val("testValidEmail@email.com");
	validateAgainstGroup($("#email3")[0], validator);
	ok($(".error").length==0 || $(".error").is(":visible")==false, "no error on the page");
});
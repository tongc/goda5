test("hello test", function() {
	ok(1 == "1", "Passed!");
});
test("jquery validate custom focusout test", function() {
	//alert($.validator.defaults.onfocusout);
	ok(1 == "1", "Passed!");
});
$(window).load(function() {
	$("form").validate({
		groups : {
			name : "email1 email2"
		},
		rules : {
			email1 : "required email",
			email2 : "required email"
		}
	});
}); 
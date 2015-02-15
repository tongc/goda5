'use strict';

describe('Home page', function () {

    var ptor;

    beforeEach(function () {
        ptor = protractor.getInstance();
        browser.get('/home');
    });

    it('should do something', function () {
        var greeting = element(by.binding('greeting'));
        expect(greeting.getText()).toEqual('Hello!');
    });

});
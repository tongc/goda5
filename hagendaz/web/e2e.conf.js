exports.config = {
    seleniumServerJar: 'node_modules/selenium-standalone/.selenium/2.44.0/server.jar',
    chromeDriver: 'node_modules/selenium-standalone/.selenium/2.44.0/chromedriver',
    baseUrl:'http://localhost:9090/index.html',
    capabilities: {
        'browserName': 'chrome'
    },

    specs: [
        'src/main/webapp/scripts/specs/**/*.js'
    ],

    jasmineNodeOpts: {
        showColors: true,
        defaultTimeoutInterval: 30000
    }
};
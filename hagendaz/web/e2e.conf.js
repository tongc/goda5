exports.config = {
    seleniumServerJar: 'node_modules/selenium/lib/runner/selenium-server-standalone-2.20.0.jar',
    chromeDriver: 'node_modules/chromedriver/bin/chromedriver',
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
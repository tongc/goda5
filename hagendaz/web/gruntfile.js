module.exports = function(grunt) {
    // tell grunt to load jshint task plugin.
    grunt.loadNpmTasks('grunt-contrib-jshint');
    // configure tasks
    grunt.initConfig({
        jshint: {
            files: ['GruntFile.js', 'src/main/resources/javascript/**/*.js', 'src/test/javascript/**/*.js']
        },
        options: {
            ignores: ['src/main/resources/javascript/lib/**/*.js'],
            configFile: 'node_modules/protractor/docs/referenceConf.js', // Default config file
            keepAlive: true, // If false, the grunt process stops when the test fails.
            args: {
                // Arguments passed to the command
            }
        },
        test: {
            configFile: 'e2e.conf.js', // Target-specific config file
            options: {
                args: {} // Target-specific arguments
            }
        },
        testlocal: {
            configFile: 'e2e.local.conf.js', // Target-specific config file
            options: {
                args: {} // Target-specific arguments
            }
        }
        // more plugin configs go here.
    });
    grunt.registerTask('default', ['jshint']);

    grunt.registerTask('test-e2e', [
        'protractor:test'
    ]);

    grunt.registerTask('test-e2e-local', [
        'protractor:testLocal'
    ]);
};
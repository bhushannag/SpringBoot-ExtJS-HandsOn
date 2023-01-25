/*
 * This file launches the application by asking Ext JS to create
 * and launch() the Application class.
 */
Ext.application({
    extend: 'PhoenixWebAppUI.Application',

    name: 'PhoenixWebAppUI',

    requires: [
        // This will automatically load all classes in the PhoenixWebAppUI namespace
        // so that application classes do not need to require each other.
        'PhoenixWebAppUI.*'
    ],

    // The name of the initial view to create.
    mainView: 'PhoenixWebAppUI.view.main.Main'
});

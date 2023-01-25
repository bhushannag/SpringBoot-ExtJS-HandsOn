/**
 * This class is the controller for the main view for the application. It is specified as
 * the "controller" of the Main view class.
 */
Ext.define('PhoenixWebAppUI.view.main.MainController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.main',

    onItemSelected: function (sender, record) {
        Ext.Msg.confirm('Confirm', 'Are you sure?', 'onConfirm', this);
    },

    onConfirm: function (choice) {
        if (choice === 'yes') {
            //
        }
    },

    // launch:function(){
    //     var loggedIn = localStorage.getItem('TutorialLoggedIn');
    //     if(loggedIn==null){
    //         Ext.getCmp('button').hide();
    //     }
    // },

    onClickButton: function () {
        localStorage.removeItem('TutorialLoggedIn');
        this.getView().destroy();
        Ext.create({
            xtype: 'app-main'
        });
        window.location.reload();
    }
});

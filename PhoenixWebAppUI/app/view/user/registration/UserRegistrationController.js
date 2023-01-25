Ext.define('PhoenixWebAppUI.view.user.registration.UserRegistrationController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.user-registration-form',

    onCreateClick: function (sender, record) {
        var studentForm = this.getView().getForm();
        //console.log(studentForm.getValues());
        data=studentForm.getValues();
        console.log(data);
        if (!studentForm.isDirty()) {
            Ext.Msg.alert('Status', 'No new data to create.');
            return;
        }
        else if (!studentForm.isValid()) {
            Ext.Msg.alert('Status', 'Invalid data.');
            return;
        }

        Ext.Ajax.request({
            method: 'POST',
            url: 'http://localhost:8080/user/addUser',
            dataType:'json',
            jsonData : data,
            headers : 
            {
                'Content-Type' : 'application/json'
            },
            clientValidation: true,
            submitEmptyText: true,
            success: function (response , action) {

                var student = Ext.create('PhoenixWebAppUI.model.User');
               var resp = Ext.decode(response.responseText);
                console.log(response);
                if (resp) {
                    // addstudent returns student model with Id so we can re-load model into form so form will have isDirty false
                    student.set(resp.data);
                    studentForm.loadRecord(student);
                }

                Ext.Msg.alert('Status', 'Saved successfully.');

            },
            failure: function (response, action) {
                if (action.failureType === Ext.form.action.Action.CLIENT_INVALID) {
                    Ext.Msg.alert('CLIENT_INVALID', 'Something has been missed. Please check and try again.');
                }
                if (action.failureType === Ext.form.action.Action.CONNECT_FAILURE) {
                    Ext.Msg.alert('CONNECT_FAILURE', 'Status: ' + action.response.status + ': ' + action.response.statusText);
                }
                if (action.failureType === Ext.form.action.Action.SERVER_INVALID) {
                    Ext.Msg.alert('SERVER_INVALID', action.result.message);
                }
            }
        });
    },
    onResetClick: function (sender, record) {
        this.getView().getForm().reset();
    },
    onClearClick: function (sender, record) {
        this.getView().clearForm();
    },

});
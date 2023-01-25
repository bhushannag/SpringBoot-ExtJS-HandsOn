Ext.define('PhoenixWebAppUI.view.user.UserRegistrationForm', {
    extend: 'Ext.form.Panel',

    xtype: 'user-registration-form',
    title: 'User Entry Form',

    controller: 'user-registration-form',
    initComponent: function () {
        Ext.apply(this,
        {
            //set jsonsubmit to true for CUD operation using form.Submit()
            jsonSubmit: true,
            url: '/api/user',
            resizable: false,
            collapsible: false,
            bodyPadding: '5',
            buttonAlign: 'center',
            border: false,
            trackResetOnLoad: true,
            layout:
            {
                type: 'vbox'
            },
            fieldDefaults:
            {
                xtype: 'textfield',
                msgTarget: 'side',
                labelAlign: 'top',
                labelStyle: 'font-weight:bold'
            },
            defaultType: 'textfield',
            items: [{
                    xtype: 'fieldcontainer',
                    layout: 'hbox',
                    defaultType: 'textfield',
                    width: '100%',
                    fieldDefaults:
                    {
                        labelAlign: 'top',
                        labelStyle: 'font-weight:bold'
                    },
                    items: [
                    {
                        fieldLabel: 'First Name',
                        flex: 1,
                        name: 'firstName',
                        margin: '0 0 0 5',
                        allowBlank: false
                    },
                        {
                            name: 'middleName',
                            flex: 1,
                            margin: '0 0 0 5',
                            fieldLabel: 'Middle Name:'
                        },
                        {
                            fieldLabel: 'Last Name',
                            flex: 1,
                            margin: '0 0 0 5',
                            name: 'lastName'
                        }]
                },
                {
                    xtype: 'fieldcontainer',
                    layout: 'hbox',
                    defaultType: 'textfield',
                    width: '100%',
                    fieldDefaults:
                    {
                        labelStyle: 'font-weight:bold'
                    },
                    items: [
                    {
                        fieldLabel: 'Email',
                        flex: 1,
                        name: 'email',
                        margin: '0 0 0 5',
                        allowBlank: false
                    },
                        {
                            xtype: 'datefield',
                            margin: '0 0 0 5',
                            fieldLabel: 'Date of Birth',
                            name: 'birthDate',
                            
                        },]
                },
                {
                    xtype: 'fieldcontainer',
                    layout: 'hbox',
                    defaultType: 'textfield',
                    width: '100%',
                    fieldDefaults:
                    {
                        labelAlign: 'top',
                        labelStyle: 'font-weight:bold'
                    },
                    items: [
                    {
                        fieldLabel: 'Occupation',
                        flex: 1,
                        name: 'occupation',
                        margin: '0 0 0 5',
                        allowBlank: false
                    },
                        {
                            name: 'jobType',
                            flex: 1,
                            margin: '0 0 0 5',
                            fieldLabel: 'Job Type'
                        },
                        {
                            fieldLabel: 'Job Description',
                            flex: 1,
                            margin: '0 0 0 5',
                            name: 'jobDescription'
                        }]
                },
                {
                    xtype: 'fieldcontainer',
                    layout: 'hbox',
                    defaultType: 'textfield',
                    width: '100%',
                    fieldDefaults:
                    {
                        labelStyle: 'font-weight:bold'
                    },
                    items: [
                        {
                            name: 'companyName',
                            flex: 1,
                            margin: '0 0 0 5',
                            fieldLabel: 'Company Name'
                        },
                        {
                            fieldLabel: 'Company Info',
                            flex: 1,
                            margin: '0 0 0 5',
                            name: 'companyInfo'
                        }]
                },
                {
                    xtype: 'fieldcontainer',
                    layout: 'hbox',
                    defaultType: 'textfield',
                    width: '100%',
                    fieldDefaults:
                    {
                        labelAlign: 'top',
                        labelStyle: 'font-weight:bold'
                    },
                    items: [
                    {
                        fieldLabel: 'Company Country',
                        flex: 1,
                        name: 'companyCountry',
                        margin: '0 0 0 5',
                        allowBlank: false
                    },
                    {
                        fieldLabel: 'Company State',
                        flex: 1,
                        margin: '0 0 0 5',
                        name: 'companyState'
                    },
                        {
                            name: 'companyCity',
                            flex: 1,
                            margin: '0 0 0 5',
                            fieldLabel: 'Company City'
                        }
                      ]
                },
                {
                    xtype: 'fieldcontainer',
                    layout: 'hbox',
                    defaultType: 'textfield',
                    width: '100%',
                    fieldDefaults:
                    {
                        labelStyle: 'font-weight:bold'
                    },
                    items: [
                    {
                        fieldLabel: 'Company Land Mark',
                        flex: 1,
                        name: 'companyLandMark',
                        margin: '0 0 0 5',
                        allowBlank: false
                    },
                        {
                            name: 'companyStreet',
                            flex: 1,
                            margin: '0 0 0 5',
                            fieldLabel: 'Company Street'
                        },
                        {
                            xtype:'numberfield',
                            fieldLabel: 'Company Pincode',
                            flex: 1,
                            margin: '0 0 0 5',
                            name: 'companyPincode'
                        }]
                },
                {
                    xtype: 'fieldcontainer',
                    layout: 'hbox',
                    defaultType: 'textfield',
                    width: '100%',
                    fieldDefaults:
                    {
                        labelAlign: 'top',
                        labelStyle: 'font-weight:bold'
                    },
                    items: [
                    {
                        fieldLabel: 'User Country',
                        flex: 1,
                        name: 'userCountry',
                        margin: '0 0 0 5',
                        allowBlank: false
                    },
                    {
                        fieldLabel: 'User State',
                        flex: 1,
                        margin: '0 0 0 5',
                        name: 'userState'
                    },
                        {
                            name: 'userCity',
                            flex: 1,
                            margin: '0 0 0 5',
                            fieldLabel: 'User City'
                        }
                      ]
                },
                {
                    xtype: 'fieldcontainer',
                    layout: 'hbox',
                    defaultType: 'textfield',
                    width: '100%',
                    fieldDefaults:
                    {
                        labelStyle: 'font-weight:bold'
                    },
                    items: [
                    {
                        fieldLabel: 'User Land Mark',
                        flex: 1,
                        name: 'userLandMark',
                        margin: '0 0 0 5',
                        allowBlank: false
                    },
                        {
                            name: 'userStreet',
                            flex: 1,
                            margin: '0 0 0 5',
                            fieldLabel: 'User Street'
                        },
                        {
                            xtype:'numberfield',
                            fieldLabel: 'User Pincode',
                            flex: 1,
                            margin: '0 0 0 5',
                            name: 'userPincode'
                        }]
                },
                {
                    xtype: 'fieldcontainer',
                    layout: 'hbox',
                    defaultType: 'textfield',
                    width: '100%',
                    fieldDefaults:
                    {
                        labelStyle: 'font-weight:bold'
                    },
                    items: [
                        {
                            name: 'password',
                            flex: 1,
                            margin: '0 0 0 5',
                            fieldLabel: 'Password'
                        },
                        {
                            fieldLabel: 'Confirm Password',
                            flex: 1,
                            margin: '0 0 0 5',
                            name: 'confirmPassword'
                        }]
                },
               
            ],
            buttons: [{
                text: 'Create',
                itemId: 'btnCreate',
                formBind: true,
                handler: 'onCreateClick'
            },
            {
                text: 'Reset',
                itemId: 'btnReset',
                handler: 'onResetClick'
            },
            {
                text: 'Clear',
                itemId: 'btnClear',
                handler: 'onClearClick'
            }]
        });

        this.callParent(arguments);

    },
    clearForm: function () {
        this.getForm().getFields().each(function (field) {
            field.validateOnChange = false;
            field.setValue('');
            field.resetOriginalValue();
        });
    }
});
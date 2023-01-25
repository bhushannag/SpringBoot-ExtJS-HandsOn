Ext.define('PhoenixWebAppUI.model.User', {
    extend: 'Ext.data.Model',
    idProperty: 'id',

    schema: {
        namespace: 'PhoenixWebAppUI.model'
    },
    fields: [
        { name: 'id', type: 'int' },
        { name: 'firstName', type: 'string' },
        { name: 'middleName', type: 'string' },
        { name: 'lastName', type: 'string' },
        { name: 'dob', type: 'date' },
        { name: 'email', type: 'string' },
        { name: 'password', type: 'string' },
        { name: 'confirmPassword', type: 'string' },
        { name: 'occupation', type: 'string' },
        { name: 'jobType', type: 'string' },
        { name: 'jobDescription', type: 'string' },
        { name: 'companyName', type: 'string' },
        { name: 'companyInfo', type: 'string' },
        { name: 'companyCountry', type: 'string' },
        { name: 'companyState', type: 'string' },
        { name: 'companyCity', type: 'string' },
        { name: 'companyLandMark', type: 'string' },
        { name: 'companyStreet', type: 'string' },
        { name: 'companyPincode', type: 'int' },
        { name: 'userCountry', type: 'string' },
        { name: 'userState', type: 'string' },
        { name: 'userCity', type: 'string' },
        { name: 'userLandMark', type: 'string' },
        { name: 'userStreet', type: 'string' },
        { name: 'userPincode', type: 'int' },       
    ]
});
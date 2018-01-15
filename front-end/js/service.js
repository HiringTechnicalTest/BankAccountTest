angular.module('app.services', []).factory('testService', function ($http) {

    var api = { baseUrl:"127.0.0.1/api/", version: "v1/"  };

    api.getBalance = function (login, account) {
        return $http({
            method: 'get',
            url: api.baseUrl+api.version+"customer/"+login+"accounts"+account+"/balance"
        });
    }

    return api;
});
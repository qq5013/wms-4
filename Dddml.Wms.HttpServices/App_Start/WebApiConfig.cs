using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Web.Http;
using Microsoft.Owin.Security.OAuth;
using Newtonsoft.Json.Serialization;
using Newtonsoft.Json;

namespace Dddml.Wms.HttpServices
{
    public static class WebApiConfig
    {
        public static void Register(HttpConfiguration config)
        {
			RAML.WebApiExplorer.DocumentationProviderConfig.IncludeXmlComments();
            // Web API 配置和服务
            // 将 Web API 配置为仅使用不记名令牌身份验证。
            config.SuppressDefaultHostAuthentication();
            config.Filters.Add(new HostAuthenticationFilter(OAuthDefaults.AuthenticationType));
            //config.Filters.Add(new HostAuthenticationFilter("Dummy"));//ONLY FOR TESTS.

            //config.Formatters.JsonFormatter.SerializerSettings.ContractResolver = new CustomContractResolver();

            // Web API 路由
            config.MapHttpAttributeRoutes();

            config.Routes.MapHttpRoute(
                name: "DefaultApi",
                routeTemplate: "api/{controller}/{id}",
                defaults: new { id = RouteParameter.Optional }
            );

            // ///////////////////////////
            config.MessageHandlers.Insert(0, new NHibernateMultiTenancyMessageHandler());
        }
    }

    // 这个不是必须的。因为 Noda Money 已经使用了相应的 JsonConverterAttribute ：
    //[JsonConverter(typeof(MoneyJsonConverter))]
    //public partial struct Money : IXmlSerializable
    //{

    //public class CustomContractResolver : DefaultContractResolver
    //{
    //    private static readonly Type _moneyType = typeof(NodaMoney.Money);
    //    private static readonly JsonConverter _moneyJsonConverter = new NodaMoney.Serialization.JsonNet.MoneyJsonConverter();
    //    protected override JsonConverter ResolveContractConverter(Type objectType)
    //    {
    //        if (objectType != null && _moneyType.IsAssignableFrom(objectType))
    //        {
    //            return _moneyJsonConverter;
    //        }
    //        return base.ResolveContractConverter(objectType);
    //    }
    //}

}
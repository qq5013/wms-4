using Dddml.Wms.HttpServices.Filters;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace Dddml.Wms.HttpServices.Controllers
{
    [AllowAnonymous]
    public partial class ValuesController : ApiController
    {
        // GET api/values
        public IEnumerable<string> Get()
        {
            return new string[] { "value1", "value2" };
        }

        // GET api/values/5
        //[SetRequesterId]
        //[Authorize]
        [AllowAnonymous]
        public string Get(int id)
        {
            return Request.RequestUri.Host + ":" + Request.RequestUri.Port;
            return "value";
        }

        //[Authorize(Roles = "")]
        // POST api/values
        public void Post([FromBody]string value)
        {
        }

        // PUT api/values/5
        public void Put(int id, [FromBody]string value)
        {
        }

        // DELETE api/values/5
        public void Delete(int id)
        {
        }
    }
}

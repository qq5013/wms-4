using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.Domain
{
    public static class DocumentStatus
    {

        public const string Initial = "";

        /// <summary>
        /// 草稿状态。可以添加行项。Drafted的单据可以撤销（Void）或完成（Complete）。
        /// </summary>
        public const string Drafted = "Drafted";

        /// <summary>
        /// 移交中。允许的在途的单据会有这个状态。
        /// </summary>
        public const string InProgress = "InProgress";

        /// <summary>
        /// 不可用。
        /// </summary>
        public const string Invalid = "Invalid";

        /// <summary>
        /// 完成状态。Completed的单据可以Close / Reverse。
        /// （在 ADempiere 中可以对 Completed 的单据作 Void，但是好像和 Reverse 的效果没有什么不同？）
        /// </summary>
        public const string Completed = "Completed";

        /// <summary>
        /// 关闭。不能再进行修改。属于最终的状态之一。
        /// </summary>
        public const string Closed = "Closed";

        /// <summary>
        /// Voided，已经被撤销。不能再做任何操作。属于最终的状态之一。
        /// </summary>
        public const string Voided = "Voided";

        /// <summary>
        /// 反转的。属于最终的状态之一。
        /// </summary>
        public const string Reversed = "Reversed";

    }
}

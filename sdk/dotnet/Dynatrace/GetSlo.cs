// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace
{
    public static class GetSlo
    {
        /// <summary>
        /// The `dynatrace.Slo` data source allows the SLO ID to be retrieved by its name.
        /// 
        /// - `name` (String) - The name of the SLO
        /// 
        /// If multiple services match the given criteria, the first result will be retrieved.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Dynatrace.GetSlo.Invoke(new()
        ///     {
        ///         Name = "Terraform",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getSloResult =&gt; getSloResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSloResult> InvokeAsync(GetSloArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSloResult>("dynatrace:index/getSlo:getSlo", args ?? new GetSloArgs(), options.WithDefaults());

        /// <summary>
        /// The `dynatrace.Slo` data source allows the SLO ID to be retrieved by its name.
        /// 
        /// - `name` (String) - The name of the SLO
        /// 
        /// If multiple services match the given criteria, the first result will be retrieved.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Dynatrace.GetSlo.Invoke(new()
        ///     {
        ///         Name = "Terraform",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getSloResult =&gt; getSloResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSloResult> Invoke(GetSloInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSloResult>("dynatrace:index/getSlo:getSlo", args ?? new GetSloInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSloArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetSloArgs()
        {
        }
        public static new GetSloArgs Empty => new GetSloArgs();
    }

    public sealed class GetSloInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetSloInvokeArgs()
        {
        }
        public static new GetSloInvokeArgs Empty => new GetSloInvokeArgs();
    }


    [OutputType]
    public sealed class GetSloResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetSloResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}

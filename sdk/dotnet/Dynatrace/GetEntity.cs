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
    public static class GetEntity
    {
        /// <summary>
        /// The entity data source allows the entity ID to be retrieved by its name and type.
        /// 
        /// - `name` (String) Display name of the entity
        /// - `type` (String) Type of the entity, e.g. SERVICE. All available entity types can be retrieved with [/api/v2/entityTypes](https://www.dynatrace.com/support/help/dynatrace-api/environment-api/entity-v2/get-all-entity-types).
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
        ///     var test = Dynatrace.GetEntity.Invoke(new()
        ///     {
        ///         Type = "SERVICE",
        ///         Name = "BookingService",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = test.Apply(getEntityResult =&gt; getEntityResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEntityResult> InvokeAsync(GetEntityArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEntityResult>("dynatrace:index/getEntity:getEntity", args ?? new GetEntityArgs(), options.WithDefaults());

        /// <summary>
        /// The entity data source allows the entity ID to be retrieved by its name and type.
        /// 
        /// - `name` (String) Display name of the entity
        /// - `type` (String) Type of the entity, e.g. SERVICE. All available entity types can be retrieved with [/api/v2/entityTypes](https://www.dynatrace.com/support/help/dynatrace-api/environment-api/entity-v2/get-all-entity-types).
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
        ///     var test = Dynatrace.GetEntity.Invoke(new()
        ///     {
        ///         Type = "SERVICE",
        ///         Name = "BookingService",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = test.Apply(getEntityResult =&gt; getEntityResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEntityResult> Invoke(GetEntityInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEntityResult>("dynatrace:index/getEntity:getEntity", args ?? new GetEntityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEntityArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetEntityArgs()
        {
        }
        public static new GetEntityArgs Empty => new GetEntityArgs();
    }

    public sealed class GetEntityInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetEntityInvokeArgs()
        {
        }
        public static new GetEntityInvokeArgs Empty => new GetEntityInvokeArgs();
    }


    [OutputType]
    public sealed class GetEntityResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string Type;

        [OutputConstructor]
        private GetEntityResult(
            string id,

            string name,

            string type)
        {
            Id = id;
            Name = name;
            Type = type;
        }
    }
}

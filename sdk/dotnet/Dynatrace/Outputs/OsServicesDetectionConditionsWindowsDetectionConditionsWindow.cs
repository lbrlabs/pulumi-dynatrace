// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class OsServicesDetectionConditionsWindowsDetectionConditionsWindow
    {
        public readonly string? Condition;
        public readonly string Property;
        public readonly string? StartupCondition;

        [OutputConstructor]
        private OsServicesDetectionConditionsWindowsDetectionConditionsWindow(
            string? condition,

            string property,

            string? startupCondition)
        {
            Condition = condition;
            Property = property;
            StartupCondition = startupCondition;
        }
    }
}

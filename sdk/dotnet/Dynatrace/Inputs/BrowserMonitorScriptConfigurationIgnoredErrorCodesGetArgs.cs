// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class BrowserMonitorScriptConfigurationIgnoredErrorCodesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("matchingDocumentRequests")]
        public Input<string>? MatchingDocumentRequests { get; set; }

        [Input("statusCodes", required: true)]
        public Input<string> StatusCodes { get; set; } = null!;

        public BrowserMonitorScriptConfigurationIgnoredErrorCodesGetArgs()
        {
        }
        public static new BrowserMonitorScriptConfigurationIgnoredErrorCodesGetArgs Empty => new BrowserMonitorScriptConfigurationIgnoredErrorCodesGetArgs();
    }
}

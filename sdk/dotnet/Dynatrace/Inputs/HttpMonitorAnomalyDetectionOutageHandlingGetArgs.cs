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

    public sealed class HttpMonitorAnomalyDetectionOutageHandlingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("globalOutage")]
        public Input<bool>? GlobalOutage { get; set; }

        [Input("globalOutagePolicies")]
        private InputList<Inputs.HttpMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyGetArgs>? _globalOutagePolicies;
        public InputList<Inputs.HttpMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyGetArgs> GlobalOutagePolicies
        {
            get => _globalOutagePolicies ?? (_globalOutagePolicies = new InputList<Inputs.HttpMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyGetArgs>());
            set => _globalOutagePolicies = value;
        }

        [Input("localOutage")]
        public Input<bool>? LocalOutage { get; set; }

        [Input("localOutagePolicies")]
        private InputList<Inputs.HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyGetArgs>? _localOutagePolicies;
        public InputList<Inputs.HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyGetArgs> LocalOutagePolicies
        {
            get => _localOutagePolicies ?? (_localOutagePolicies = new InputList<Inputs.HttpMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyGetArgs>());
            set => _localOutagePolicies = value;
        }

        [Input("retryOnError")]
        public Input<bool>? RetryOnError { get; set; }

        public HttpMonitorAnomalyDetectionOutageHandlingGetArgs()
        {
        }
        public static new HttpMonitorAnomalyDetectionOutageHandlingGetArgs Empty => new HttpMonitorAnomalyDetectionOutageHandlingGetArgs();
    }
}

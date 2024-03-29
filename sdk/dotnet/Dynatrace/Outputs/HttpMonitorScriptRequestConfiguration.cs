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
    public sealed class HttpMonitorScriptRequestConfiguration
    {
        public readonly bool? AcceptAnyCertificate;
        public readonly string? ClientCertificate;
        public readonly bool? FollowRedirects;
        public readonly Outputs.HttpMonitorScriptRequestConfigurationHeaders? Headers;
        public readonly bool? SensitiveData;
        public readonly string? UserAgent;

        [OutputConstructor]
        private HttpMonitorScriptRequestConfiguration(
            bool? acceptAnyCertificate,

            string? clientCertificate,

            bool? followRedirects,

            Outputs.HttpMonitorScriptRequestConfigurationHeaders? headers,

            bool? sensitiveData,

            string? userAgent)
        {
            AcceptAnyCertificate = acceptAnyCertificate;
            ClientCertificate = clientCertificate;
            FollowRedirects = followRedirects;
            Headers = headers;
            SensitiveData = sensitiveData;
            UserAgent = userAgent;
        }
    }
}

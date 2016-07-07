//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.42000
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2016.LiveContest.LaunchConfiguration
{
    
    
    /// <summary>
    /// The public interface for Model
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(Model))]
    [XmlDefaultImplementationTypeAttribute(typeof(Model))]
    public interface IModel : IModelElement
    {
        
        /// <summary>
        /// The name property
        /// </summary>
        string Name
        {
            get;
            set;
        }
        
        /// <summary>
        /// The location property
        /// </summary>
        string Location
        {
            get;
            set;
        }
        
        /// <summary>
        /// The readOnLoad property
        /// </summary>
        Nullable<bool> ReadOnLoad
        {
            get;
            set;
        }
        
        /// <summary>
        /// The storeOnDisposal property
        /// </summary>
        Nullable<bool> StoreOnDisposal
        {
            get;
            set;
        }
        
        /// <summary>
        /// The metamodels property
        /// </summary>
        IListExpression<IMetamodel> Metamodels
        {
            get;
        }
        
        /// <summary>
        /// Gets fired when the Name property changed its value
        /// </summary>
        event EventHandler<ValueChangedEventArgs> NameChanged;
        
        /// <summary>
        /// Gets fired when the Location property changed its value
        /// </summary>
        event EventHandler<ValueChangedEventArgs> LocationChanged;
        
        /// <summary>
        /// Gets fired when the ReadOnLoad property changed its value
        /// </summary>
        event EventHandler<ValueChangedEventArgs> ReadOnLoadChanged;
        
        /// <summary>
        /// Gets fired when the StoreOnDisposal property changed its value
        /// </summary>
        event EventHandler<ValueChangedEventArgs> StoreOnDisposalChanged;
    }
}


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
using NMF.Models.Repository;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2016.LiveContest.Dataflow
{
    
    
    /// <summary>
    /// The public interface for Sort
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(Sort))]
    [XmlDefaultImplementationTypeAttribute(typeof(Sort))]
    public interface ISort : IModelElement, IElement
    {
        
        /// <summary>
        /// The sortBy property
        /// </summary>
        IExpression SortBy
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the SortBy property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> SortByChanging;
        
        /// <summary>
        /// Gets fired when the SortBy property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> SortByChanged;
    }
}


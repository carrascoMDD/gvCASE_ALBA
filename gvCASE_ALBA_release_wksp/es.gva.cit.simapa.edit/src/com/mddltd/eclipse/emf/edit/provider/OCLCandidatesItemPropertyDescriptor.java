package com.mddltd.eclipse.emf.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;



import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.emf.ocl.expressions.OCLExpression;

import org.eclipse.emf.ocl.expressions.util.EvalEnvironment;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;

import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.parser.ParserException;

import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;


public class OCLCandidatesItemPropertyDescriptor extends ItemPropertyDescriptor {

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EReference[] parentReferences, boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EReference[] parentReferences, boolean isSettable, String category) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable, category);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EReference[] parentReferences, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences, isSettable);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EReference[] parentReferences) {
		super(adapterFactory, resourceLocator, displayName, description,
				parentReferences);
		// TODO Auto-generated constructor stub
	}

	
	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, staticImage, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, Object staticImage, String category) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, staticImage, category);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, Object staticImage) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, staticImage);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, String category) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable, category);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description, feature,
				isSettable);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature) {
		super(adapterFactory, resourceLocator, displayName, description, feature);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EReference[] parentReferences, boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, parentReferences, isSettable,
				category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EReference[] parentReferences, boolean isSettable, String category) {
		super(adapterFactory, displayName, description, parentReferences, isSettable,
				category);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EReference[] parentReferences, boolean isSettable) {
		super(adapterFactory, displayName, description, parentReferences, isSettable);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EReference[] parentReferences) {
		super(adapterFactory, displayName, description, parentReferences);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EStructuralFeature feature, boolean isSettable, Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage, category, filterFlags);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EStructuralFeature feature, boolean isSettable, Object staticImage, String category) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage, category);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EStructuralFeature feature, boolean isSettable, Object staticImage) {
		super(adapterFactory, displayName, description, feature, isSettable,
				staticImage);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EStructuralFeature feature, boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable, category,
				filterFlags);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EStructuralFeature feature, boolean isSettable, String category) {
		super(adapterFactory, displayName, description, feature, isSettable, category);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, displayName, description, feature, isSettable);
		// TODO Auto-generated constructor stub
	}

	public OCLCandidatesItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName, String description, EStructuralFeature feature) {
		super(adapterFactory, displayName, description, feature);
		// TODO Auto-generated constructor stub
	}


	
	
	 public Collection getChoiceOfValues(Object object)
	  {
	    return getComboBoxObjects(object);
	  }
	  
	
		private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/OCL/examples/ocl";
	 
		/**
		 * The parsed OCL expression for the derivation of candidates to be added to the property.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
	 private transient OCLExpression candidatesOCL;
	 
	 
	 
	 protected Collection getCandidates( Object object) {
			EStructuralFeature eFeature = feature;
//		System.out.print("Computing candidates for feature ");
//		System.out.print(eFeature.getName());
//		System.out.println();
			
				
		
//			if (candidatesOCL == null) { 
				EAnnotation ocl = eFeature.getEAnnotation(OCL_ANNOTATION_SOURCE);
				if (ocl == null) {
					System.out.println("No Annotation");
					return null;
				}
				String candidates = (String) ocl.getDetails().get("candidates"); //$NON-NLS-1$
				if (candidates == null || candidates.length() < 1) {
					System.out.println("No candidates details");
					return null;
				}

				Environment env = ExpressionsUtil.createPropertyContext( eFeature.getEContainingClass(), eFeature);
				
				try {
					candidatesOCL = ExpressionsUtil.createQuery(env, candidates, true);
				} catch (ParserException e) {
					System.out.println(object.getClass().getName());
					System.out.println(eFeature.getName());
					System.out.println("Parse failure");
					System.out.println( e.getLocalizedMessage());
					throw new UnsupportedOperationException(e.getLocalizedMessage());
				}
//			}
			
			Query query = QueryFactory.eINSTANCE.createQuery(candidatesOCL);
			EvalEnvironment evalEnv = new EvalEnvironment();
			query.setEvaluationEnvironment(evalEnv);
			
			Collection result = null;
			try {
				result = (Collection) query.evaluate(object);
			}
			catch(Exception e) {
				System.out.println(object.getClass().getName());
				System.out.println(eFeature.getName());
				System.out.println("Evaluation Failure");				
				System.out.println(e.getLocalizedMessage());				
				System.out.println(candidatesOCL);				
			}
			
			if( result == null) {
				System.out.println(object.getClass().getName());
				System.out.println(eFeature.getName());
				System.out.println("Query evaluated null");				
			}
			else {
				System.out.println(object.getClass().getName());
				System.out.println(eFeature.getName());
				System.out.print("Query evaluated " );
				System.out.println(result.size());
			}
			
			return result;
		}
	 
	 
	 /**
	   * This will be called to populate a list of choices.
	   * The label provider will be used to determine the labels for the objects this returns.
	   * This default implementation uses {@link #getReachableObjectsOfType getReachableObjectsOfType}.
	   */
	  protected Collection getComboBoxObjects(Object object)
	  {
	    if ( (object instanceof EObject) && 
	    	(parentReferences == null) &&
	    	(feature != null) &&
	    	(feature instanceof EReference)) {
	          Collection result = getCandidates( object);
	          if ( result != null) {
	        	  return result;
	          }
	    }
	    
	    return super.getComboBoxObjects( object);
	  }


	
}

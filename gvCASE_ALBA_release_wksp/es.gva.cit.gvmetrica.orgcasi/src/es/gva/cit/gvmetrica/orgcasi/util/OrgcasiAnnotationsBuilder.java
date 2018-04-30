package es.gva.cit.gvmetrica.orgcasi.util;


import es.gva.cit.gvmetrica.orgcasi.AAplicacion;
import es.gva.cit.gvmetrica.orgcasi.ADocumento;
import es.gva.cit.gvmetrica.orgcasi.ADocumentoFinal;
import es.gva.cit.gvmetrica.orgcasi.AEstructuraFuncional;
import es.gva.cit.gvmetrica.orgcasi.AFlujo;
import es.gva.cit.gvmetrica.orgcasi.ANormativaYLegislacion;
import es.gva.cit.gvmetrica.orgcasi.AOperacion;
import es.gva.cit.gvmetrica.orgcasi.AProcedimiento;
import es.gva.cit.gvmetrica.orgcasi.ARepositorio;
import es.gva.cit.gvmetrica.orgcasi.ASubprocedimiento;
import es.gva.cit.gvmetrica.orgcasi.ATerminoGlosario;
import es.gva.cit.gvmetrica.orgcasi.AUnidad;
import es.gva.cit.gvmetrica.orgcasi.AUnidadExterna;
import es.gva.cit.gvmetrica.orgcasi.AUnidadOrganica;
import es.gva.cit.gvmetrica.orgcasi.Accion;
import es.gva.cit.gvmetrica.orgcasi.Actor;
import es.gva.cit.gvmetrica.orgcasi.ActorFuncional;
import es.gva.cit.gvmetrica.orgcasi.Agrupacion;
import es.gva.cit.gvmetrica.orgcasi.Anotacion;
import es.gva.cit.gvmetrica.orgcasi.CAccionesSuceso;
import es.gva.cit.gvmetrica.orgcasi.CActores;
import es.gva.cit.gvmetrica.orgcasi.CActoresSuceso;
import es.gva.cit.gvmetrica.orgcasi.CAplicaciones;
import es.gva.cit.gvmetrica.orgcasi.CCamposDatos;
import es.gva.cit.gvmetrica.orgcasi.CDocumentos;
import es.gva.cit.gvmetrica.orgcasi.CEntradasAccion;
import es.gva.cit.gvmetrica.orgcasi.CEntradasSuceso;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatos;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasDatosSuceso;
import es.gva.cit.gvmetrica.orgcasi.CEstructurasFuncionales;
import es.gva.cit.gvmetrica.orgcasi.CFlujos;
import es.gva.cit.gvmetrica.orgcasi.CFlujosSuceso;
import es.gva.cit.gvmetrica.orgcasi.CNormativasYLegislaciones;
import es.gva.cit.gvmetrica.orgcasi.COperaciones;
import es.gva.cit.gvmetrica.orgcasi.CProcedimientos;
import es.gva.cit.gvmetrica.orgcasi.CRelacionesDatos;
import es.gva.cit.gvmetrica.orgcasi.CSalidasAccion;
import es.gva.cit.gvmetrica.orgcasi.CSalidasSuceso;
import es.gva.cit.gvmetrica.orgcasi.CSistemas;
import es.gva.cit.gvmetrica.orgcasi.CSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.CSucesos;
import es.gva.cit.gvmetrica.orgcasi.CTerminosGlosario;
import es.gva.cit.gvmetrica.orgcasi.CUnidades;
import es.gva.cit.gvmetrica.orgcasi.CUnidadesExternas;
import es.gva.cit.gvmetrica.orgcasi.CUnidadesOrganicas;
import es.gva.cit.gvmetrica.orgcasi.CampoDatos;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSubsistemas;
import es.gva.cit.gvmetrica.orgcasi.ContenedorSucesos;
import es.gva.cit.gvmetrica.orgcasi.EntradaAccion;
import es.gva.cit.gvmetrica.orgcasi.EntradaOSalida;
import es.gva.cit.gvmetrica.orgcasi.EntradaSuceso;
import es.gva.cit.gvmetrica.orgcasi.EstructuraDatos;
import es.gva.cit.gvmetrica.orgcasi.MiembroRelacion;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiFactory;
import es.gva.cit.gvmetrica.orgcasi.OrgcasiPackage;
import es.gva.cit.gvmetrica.orgcasi.RelacionDatos;
import es.gva.cit.gvmetrica.orgcasi.SalidaAccion;
import es.gva.cit.gvmetrica.orgcasi.SalidaSuceso;
import es.gva.cit.gvmetrica.orgcasi.Sistema;
import es.gva.cit.gvmetrica.orgcasi.Subsistema;
import es.gva.cit.gvmetrica.orgcasi.Suceso;
import es.gva.cit.gvmetrica.orgcasi.SucesoConstructor;
import es.gva.cit.gvmetrica.orgcasi.SucesoConsultor;
import es.gva.cit.gvmetrica.orgcasi.TipoAgrupacionPredefinida;
import es.gva.cit.gvmetrica.orgcasi.TipoPrioridad;
import es.gva.cit.gvmetrica.orgcasi.TipoPropiedadClaseAgrupacion;
import es.gva.cit.gvmetrica.orgcasi.TipoRelacion;
import es.gva.cit.gvmetrica.orgcasi.TipoSubsistema;
import es.gva.cit.gvmetrica.orgcasi.TipoUnidad;
import es.gva.cit.gvmetrica.orgcasi.TipoUsoDocumento;
import es.gva.cit.gvmetrica.orgcasi.UsoSuceso;

import es.gva.cit.simapa.Repositorio;
import es.gva.cit.simapa.Procedimiento;
import es.gva.cit.simapa.NormativaYLegislacion;
import es.gva.cit.simapa.Procedimientos;
import es.gva.cit.simapa.TerminoGlosario;
import es.gva.cit.simapa.UnidadOrganica;
import es.gva.cit.simapa.Operaciones;
import es.gva.cit.simapa.Operacion;
import es.gva.cit.simapa.Subprocedimiento;
import es.gva.cit.simapa.DocumentoFinal;
import es.gva.cit.simapa.Documento;
import es.gva.cit.simapa.Aplicacion;
import es.gva.cit.simapa.Flujo;






import org.eclipse.emf.common.util.EList;

/*
 * OJO ACV
 */
public class OrgcasiAnnotationsBuilder {
	
	
	
	public static int createAnotacionesParaRepositorio( ARepositorio theARepositorio) { 
		int aNumAnotaciones = 0;
		
		if (theARepositorio == null) {
			return aNumAnotaciones;
		}
		aNumAnotaciones = aNumAnotaciones + createAnotacionesProcedimientosDeRepositorio( theARepositorio);
		
		return aNumAnotaciones;
	}
	
	
	
	
	
	public static int createAnotacionesProcedimientosDeRepositorio( ARepositorio theARepositorio) { 
		Repositorio 				aRepositorio;
		EList						someNormativas;
		int aNumAnotaciones = 0;
		
		if (theARepositorio == null) { return aNumAnotaciones; }
		
		aRepositorio = theARepositorio.getRepositorio();
		if( aRepositorio == null) { return aNumAnotaciones; }

		Procedimientos aColeccionProcedimientos = aRepositorio.getProcedimientos();
		if( aColeccionProcedimientos == null) { return aNumAnotaciones;}

		EList someProcedimientos = aColeccionProcedimientos.getProcedimientos();
		int aNumProcedimientos = someProcedimientos.size();
		for( int aProcedimientoIndex = 0; aProcedimientoIndex < aNumProcedimientos; aProcedimientoIndex++) {
			Procedimiento aProcedimiento = (Procedimiento) someProcedimientos.get( aProcedimientoIndex);

			if( aProcedimiento != null) {
				AProcedimiento aAProcedimiento = fFindOrCreateAProcedimientoEnARepositorioFor( theARepositorio, aProcedimiento);
				aNumAnotaciones = aNumAnotaciones + 1;
			}
		}	
		return aNumAnotaciones;
	}
	
	
	
	private static AProcedimiento fFindOrCreateAProcedimientoEnARepositorioFor( ARepositorio theARepositorio, Procedimiento theProcedimiento) {

		if( theARepositorio == null) { return null;}
		if( theProcedimiento == null) { return null;}

		
		CProcedimientos aColeccionAProcedimientos = theARepositorio.getAnotacionesProcedimiento();
		if( aColeccionAProcedimientos == null) {
			aColeccionAProcedimientos = OrgcasiFactory.eINSTANCE.createCProcedimientos();
			theARepositorio.setAnotacionesProcedimiento( aColeccionAProcedimientos);
		}
		
		EList someAProcedimientos = aColeccionAProcedimientos.getProcedimientos();
		int aNumAProcedimientos = someAProcedimientos.size();
		for( int aAProcedimientoIndex = 0; aAProcedimientoIndex < aNumAProcedimientos; aAProcedimientoIndex++) {
			AProcedimiento aAProcedimiento = null;
			try {
				aAProcedimiento = (AProcedimiento) someAProcedimientos.get( aAProcedimientoIndex);
			} 	catch( ClassCastException anException) {}
			if ( aAProcedimiento != null) {
				if( theProcedimiento == aAProcedimiento.getProcedimiento() ) {
					return aAProcedimiento;
				}
			}
		}
		
		AProcedimiento aAProcedimiento = fCreateAProcedimientoEnRepositorioFor( theARepositorio, theProcedimiento); 
		return aAProcedimiento;
	}
	
	
	
	private static AProcedimiento fCreateAProcedimientoEnRepositorioFor( ARepositorio theARepositorio, Procedimiento theProcedimiento) {

		if( theARepositorio == null) { return null;}
		if( theProcedimiento == null) { return null;}

		
		CProcedimientos aColeccionAProcedimientos = theARepositorio.getAnotacionesProcedimiento();
		if( aColeccionAProcedimientos == null) {
			aColeccionAProcedimientos = OrgcasiFactory.eINSTANCE.createCProcedimientos();
			theARepositorio.setAnotacionesProcedimiento( aColeccionAProcedimientos);
		}

		AProcedimiento aAProcedimiento = OrgcasiFactory.eINSTANCE.createAProcedimiento();
		theARepositorio.getAnotacionesProcedimiento().getProcedimientos().add( aAProcedimiento);
		aAProcedimiento.setProcedimiento( theProcedimiento);

		aAProcedimiento.crearAnotaciones();
		
		return aAProcedimiento;
	}
	
	
	
	
	public static int createAnotacionesParaProcedimiento( AProcedimiento theAProcedimiento) { 
		int aNumAnotaciones = 0;
		
		if (theAProcedimiento == null) {
			return aNumAnotaciones;
		}
		aNumAnotaciones = aNumAnotaciones + createAnotacionesParaNormativasDeProcedimiento( theAProcedimiento);
		aNumAnotaciones = aNumAnotaciones + createAnotacionesParaTerminosGlosarioDeProcedimiento( theAProcedimiento);
		aNumAnotaciones = aNumAnotaciones + createAnotacionesParaUnidadesOrganicasDeProcedimiento( theAProcedimiento);
		aNumAnotaciones = aNumAnotaciones + createAnotacionesParaUnidadesExternasDeProcedimiento( theAProcedimiento);
		aNumAnotaciones = aNumAnotaciones + createAnotacionesParaEstructurasFunctionalesDeProcedimiento( theAProcedimiento);
		aNumAnotaciones = aNumAnotaciones + createAnotacionesParaDocumentosDeProcedimiento( theAProcedimiento);
		aNumAnotaciones = aNumAnotaciones + createAnotacionesParaAplicacionesDeProcedimiento( theAProcedimiento);
		aNumAnotaciones = aNumAnotaciones + createAnotacionesParaOperacionesDeProcedimiento( theAProcedimiento);
		aNumAnotaciones = aNumAnotaciones + createAnotacionesParaFlujosDeProcedimiento( theAProcedimiento);
		
		return aNumAnotaciones;
	}
	
	public static int createAnotacionesParaNormativasDeProcedimiento( AProcedimiento theAProcedimiento) { 
		Procedimiento 				aProcedimiento;
		EList						someNormativas;
		int aNumAnotaciones = 0;
		
		if (theAProcedimiento == null) { return aNumAnotaciones; }
		
		aProcedimiento = theAProcedimiento.getProcedimiento();
		if( aProcedimiento == null) { return aNumAnotaciones; }
		
		someNormativas = aProcedimiento.getNormativas();
		int aNumNormativas = someNormativas.size();
		for( int anIndex = 0; anIndex < aNumNormativas; anIndex++) {
			Object aNormativaObject = someNormativas.get( anIndex);
			if (aNormativaObject != null ) {
				NormativaYLegislacion aNormativa = null;
				try {
					aNormativa = (NormativaYLegislacion) aNormativaObject;
			} 	catch( ClassCastException anException) {
			}
				if ( aNormativa != null) {
// System.out.println( aNormativa.getEtiqueta());
					
					ANormativaYLegislacion aANormativa = fFindOrCreateANormativaEnAProcedimientoFor( theAProcedimiento, aNormativa);
					aNumAnotaciones = aNumAnotaciones + 1;
				}
			}
		}	
		return aNumAnotaciones;
	}
	
	
	
	
	private static ANormativaYLegislacion fCreateANormativaEnAProcedimientoFor( AProcedimiento theAProcedimiento, NormativaYLegislacion theNormativa) {
		CNormativasYLegislaciones 	aANormativasCollection;
		EList						someANormativas;

		aANormativasCollection = theAProcedimiento.getNormativas();
		if( aANormativasCollection == null) { 
			aANormativasCollection = OrgcasiFactory.eINSTANCE.createCNormativasYLegislaciones();
			theAProcedimiento.setNormativas(aANormativasCollection);
		}

		ANormativaYLegislacion aANormativa = OrgcasiFactory.eINSTANCE.createANormativaYLegislacion();
		aANormativa.setNormativa(theNormativa);
		
		aANormativasCollection.getNormativas().add( aANormativa);
		
		return aANormativa;
	}
	
	
	
	private static ANormativaYLegislacion fFindOrCreateANormativaEnAProcedimientoFor( AProcedimiento theAProcedimiento, NormativaYLegislacion theNormativa) {
		CNormativasYLegislaciones 	aANormativasCollection;
		EList						someANormativas;

		if( theAProcedimiento == null) { return null;}
		if( theNormativa == null) { return null;}
		
		aANormativasCollection = theAProcedimiento.getNormativas();
		if( aANormativasCollection != null) {
		
			someANormativas = aANormativasCollection.getNormativas();
			int aNumNormativas = someANormativas.size();
			for( int anIndex = 0; anIndex < aNumNormativas; anIndex++) {
				Object aANormativaObject = someANormativas.get( anIndex);
				if (aANormativaObject != null ) {
					ANormativaYLegislacion aANormativa = null;
					try {
						aANormativa = (ANormativaYLegislacion) aANormativaObject;
					} 	catch( ClassCastException anException) {
					}
					if ( aANormativa != null) {
 // 	System.out.println( aANormativa.getEtiqueta());
						NormativaYLegislacion aNormativa = aANormativa.getNormativa();
						if ( aNormativa != null) {
						if ( aNormativa == theNormativa ) {
								return aANormativa;
							}
						}
					}
				}
			}	
		}
		
		ANormativaYLegislacion aANormativa = fCreateANormativaEnAProcedimientoFor( theAProcedimiento, theNormativa); 
		return aANormativa;
	}
	
	

	
	public static int createAnotacionesParaTerminosGlosarioDeProcedimiento( AProcedimiento theAProcedimiento) { 
		Procedimiento 				aProcedimiento;
		EList					someTerminosGlosario;
		int aNumAnotaciones = 0;
		
		if (theAProcedimiento == null) { return aNumAnotaciones; }
		
		aProcedimiento = theAProcedimiento.getProcedimiento();
		if( aProcedimiento == null) { return aNumAnotaciones; }
		
		someTerminosGlosario = aProcedimiento.getTerminos();
		int aNumTerminosGlosario = someTerminosGlosario.size();
		for( int anIndex = 0; anIndex < aNumTerminosGlosario; anIndex++) {
			Object aTerminoGlosarioObject = someTerminosGlosario.get( anIndex);
			if (aTerminoGlosarioObject != null ) {
				TerminoGlosario aTerminoGlosario = null;
				try {
					aTerminoGlosario = (TerminoGlosario) aTerminoGlosarioObject;
			} 	catch( ClassCastException anException) {
			}
				if ( aTerminoGlosario != null) {
// System.out.println( aTerminoGlosario.getEtiqueta());
					
					ATerminoGlosario aATerminoGlosario = fFindOrCreateATerminoGlosarioEnAProcedimientoFor( theAProcedimiento, aTerminoGlosario);
					aNumAnotaciones = aNumAnotaciones + 1;
				}
			}
		}	
		return aNumAnotaciones;
	}
	
	
	
	
	private static ATerminoGlosario fCreateATerminoGlosarioEnAProcedimientoFor( AProcedimiento theAProcedimiento, TerminoGlosario theTerminoGlosario) {
		CTerminosGlosario 	aATerminosGlosarioCollection;
		EList						someATerminosGlosario;

		aATerminosGlosarioCollection = theAProcedimiento.getTerminosGlosario();
		if( aATerminosGlosarioCollection == null) { 
			aATerminosGlosarioCollection = OrgcasiFactory.eINSTANCE.createCTerminosGlosario();
			theAProcedimiento.setTerminosGlosario(aATerminosGlosarioCollection);
		}

		ATerminoGlosario aATerminoGlosario = OrgcasiFactory.eINSTANCE.createATerminoGlosario();
		aATerminoGlosario.setTerminoGlosario(theTerminoGlosario);
		
		aATerminosGlosarioCollection.getTerminosGlosario().add( aATerminoGlosario);
		
		return aATerminoGlosario;
	}
	
	
	
	private static ATerminoGlosario fFindOrCreateATerminoGlosarioEnAProcedimientoFor( AProcedimiento theAProcedimiento, TerminoGlosario theTerminoGlosario) {
		CTerminosGlosario 	aATerminosGlosarioCollection;
		EList						someATerminosGlosario;

		if( theAProcedimiento == null) { return null;}
		if( theTerminoGlosario == null) { return null;}
		
		aATerminosGlosarioCollection = theAProcedimiento.getTerminosGlosario();
		if( aATerminosGlosarioCollection != null) {
		
			someATerminosGlosario = aATerminosGlosarioCollection.getTerminosGlosario();
			int aNumTerminosGlosario = someATerminosGlosario.size();
			for( int anIndex = 0; anIndex < aNumTerminosGlosario; anIndex++) {
				Object aATerminoGlosarioObject = someATerminosGlosario.get( anIndex);
				if (aATerminoGlosarioObject != null ) {
					ATerminoGlosario aATerminoGlosario = null;
					try {
						aATerminoGlosario = (ATerminoGlosario) aATerminoGlosarioObject;
					} 	catch( ClassCastException anException) {
					}
					if ( aATerminoGlosario != null) {
 // 	System.out.println( aATerminoGlosario.getEtiqueta());
						TerminoGlosario aTerminoGlosario = aATerminoGlosario.getTerminoGlosario();
						if ( aTerminoGlosario != null) {
						if ( aTerminoGlosario == theTerminoGlosario ) {
								return aATerminoGlosario;
							}
						}
					}
				}
			}	
		}
		
		ATerminoGlosario aATerminoGlosario = fCreateATerminoGlosarioEnAProcedimientoFor( theAProcedimiento, theTerminoGlosario); 
		return aATerminoGlosario;
	}
	
	

		

	
	public static int createAnotacionesParaUnidadesOrganicasDeProcedimiento( AProcedimiento theAProcedimiento) { 
		Procedimiento 				aProcedimiento;
		EList					someUnidadesOrganicas;
		int aNumAnotaciones = 0;
		
		if (theAProcedimiento == null) { return aNumAnotaciones; }
		
		aProcedimiento = theAProcedimiento.getProcedimiento();
		if( aProcedimiento == null) { return aNumAnotaciones; }
		
		someUnidadesOrganicas = aProcedimiento.getUnidades();
		int aNumUnidadesOrganicas = someUnidadesOrganicas.size();
		for( int anIndex = 0; anIndex < aNumUnidadesOrganicas; anIndex++) {
			Object aUnidadOrganicaObject = someUnidadesOrganicas.get( anIndex);
			if (aUnidadOrganicaObject != null ) {
				UnidadOrganica aUnidadOrganica = null;
				try {
					aUnidadOrganica = (UnidadOrganica) aUnidadOrganicaObject;
			} 	catch( ClassCastException anException) {
			}
				if ( aUnidadOrganica != null) {
// System.out.println( aUnidadOrganica.getEtiqueta());
					
					AUnidadOrganica aAUnidadOrganica = fFindOrCreateAUnidadOrganicaEnAProcedimientoFor( theAProcedimiento, aUnidadOrganica);
					aNumAnotaciones = aNumAnotaciones + 1;
				}
			}
		}	
		return aNumAnotaciones;
	}
	
	
	
	
	private static AUnidadOrganica fCreateAUnidadOrganicaEnAProcedimientoFor( AProcedimiento theAProcedimiento, UnidadOrganica theUnidadOrganica) {
		CUnidadesOrganicas 	aAUnidadesOrganicasCollection;
		EList						someAUnidadesOrganicas;

		aAUnidadesOrganicasCollection = theAProcedimiento.getUnidadesOrganicas();
		if( aAUnidadesOrganicasCollection == null) { 
			aAUnidadesOrganicasCollection = OrgcasiFactory.eINSTANCE.createCUnidadesOrganicas();
			theAProcedimiento.setUnidadesOrganicas(aAUnidadesOrganicasCollection);
		}

		AUnidadOrganica aAUnidadOrganica = OrgcasiFactory.eINSTANCE.createAUnidadOrganica();
		aAUnidadOrganica.setUnidad(theUnidadOrganica);
		
		aAUnidadesOrganicasCollection.getUnidades().add( aAUnidadOrganica);
		
		return aAUnidadOrganica;
	}
	
	
	
	private static AUnidadOrganica fFindOrCreateAUnidadOrganicaEnAProcedimientoFor( AProcedimiento theAProcedimiento, UnidadOrganica theUnidadOrganica) {
		CUnidadesOrganicas 	aAUnidadesOrganicasCollection;
		EList						someAUnidadesOrganicas;

		if( theAProcedimiento == null) { return null;}
		if( theUnidadOrganica == null) { return null;}
		
		aAUnidadesOrganicasCollection = theAProcedimiento.getUnidadesOrganicas();
		if( aAUnidadesOrganicasCollection != null) {
		
			someAUnidadesOrganicas = aAUnidadesOrganicasCollection.getUnidades();
			int aNumUnidadesOrganicas = someAUnidadesOrganicas.size();
			for( int anIndex = 0; anIndex < aNumUnidadesOrganicas; anIndex++) {
				Object aAUnidadOrganicaObject = someAUnidadesOrganicas.get( anIndex);
				if (aAUnidadOrganicaObject != null ) {
					AUnidadOrganica aAUnidadOrganica = null;
					try {
						aAUnidadOrganica = (AUnidadOrganica) aAUnidadOrganicaObject;
					} 	catch( ClassCastException anException) {
					}
					if ( aAUnidadOrganica != null) {
 // 	System.out.println( aAUnidadOrganica.getEtiqueta());
						UnidadOrganica aUnidadOrganica = aAUnidadOrganica.getUnidad();
						if ( aUnidadOrganica != null) {
						if ( aUnidadOrganica == theUnidadOrganica ) {
								return aAUnidadOrganica;
							}
						}
					}
				}
			}	
		}
		
		AUnidadOrganica aAUnidadOrganica = fCreateAUnidadOrganicaEnAProcedimientoFor( theAProcedimiento, theUnidadOrganica); 
		return aAUnidadOrganica;
	}
	
	

		

	public static int createAnotacionesParaUnidadesExternasDeProcedimiento( AProcedimiento theAProcedimiento) { 
		return 0;
	}

	public static int createAnotacionesParaEstructurasFunctionalesDeProcedimiento( AProcedimiento theAProcedimiento) { 
		return 0;
	}
	
	
	

	
	public static int createAnotacionesParaOperacionesDeProcedimiento( AProcedimiento theAProcedimiento) { 
		Procedimiento 				aProcedimiento;
		Operaciones					aOperacionesCollection;
		EList						someOperaciones;
		int aNumAnotaciones = 0;
		
		if (theAProcedimiento == null) { return aNumAnotaciones; }
		
		aProcedimiento = theAProcedimiento.getProcedimiento();
		if( aProcedimiento == null) { return aNumAnotaciones; }
		
		aOperacionesCollection = aProcedimiento.getOperaciones();
		if ( aOperacionesCollection == null) { return aNumAnotaciones; }
		
		someOperaciones = aOperacionesCollection.getOperaciones();
		int aNumOperaciones = someOperaciones.size();
		for( int anIndex = 0; anIndex < aNumOperaciones; anIndex++) {
			Object aOperacionObject = someOperaciones.get( anIndex);
			if (aOperacionObject != null ) {
				Operacion aOperacion = null;
				try {
					aOperacion = (Operacion) aOperacionObject;
			} 	catch( ClassCastException anException) {
			}
				if ( aOperacion != null) {
// System.out.println( aOperacion.getEtiqueta());
					
					AOperacion aAOperacion = fFindOrCreateAOperacionEnAProcedimientoFor( theAProcedimiento, aOperacion);
					aNumAnotaciones = aNumAnotaciones + 1;
				}
			}
		}	
		return aNumAnotaciones;
	}
	
	
	
	
	private static AOperacion fCreateAOperacionEnAProcedimientoFor( AProcedimiento theAProcedimiento, Operacion theOperacion) {
		COperaciones 	aAOperacionesCollection;
		AOperacion 		aAOperacion;

		aAOperacionesCollection = theAProcedimiento.getOperaciones();
		if( aAOperacionesCollection == null) { 
			aAOperacionesCollection = OrgcasiFactory.eINSTANCE.createCOperaciones();
			theAProcedimiento.setOperaciones(aAOperacionesCollection);
		}

		Subprocedimiento aSubprocedimiento = null;
		try {	
			aSubprocedimiento = (Subprocedimiento) theOperacion;
		} catch( ClassCastException anException) {}
		if( aSubprocedimiento != null) {
			ASubprocedimiento aASubprocedimiento = OrgcasiFactory.eINSTANCE.createASubprocedimiento();
			aASubprocedimiento.setOperacion( theOperacion);
			aAOperacion = aASubprocedimiento;
		}
		else {
			DocumentoFinal aDocumentoFinal = null;
			try {	
				aDocumentoFinal = (DocumentoFinal) theOperacion;
			} catch( ClassCastException anException) {}
			if( aDocumentoFinal != null) {
				ADocumentoFinal aADocumentoFinal = OrgcasiFactory.eINSTANCE.createADocumentoFinal();
				aADocumentoFinal.setOperacion( theOperacion);
				aAOperacion = aADocumentoFinal;
			}
			else {
				aAOperacion = OrgcasiFactory.eINSTANCE.createAOperacion();
				aAOperacion.setOperacion( theOperacion);
			}
		}
				
		aAOperacionesCollection.getOperaciones().add( aAOperacion);
		
		return aAOperacion;
	}
	
	
	
	
	
	
	
	
	private static AOperacion fFindOrCreateAOperacionEnAProcedimientoFor( AProcedimiento theAProcedimiento, Operacion theOperacion) {
		COperaciones 	aAOperacionesCollection;
		EList						someAOperaciones;

		if( theAProcedimiento == null) { return null;}
		if( theOperacion == null) { return null;}
		
		aAOperacionesCollection = theAProcedimiento.getOperaciones();
		if( aAOperacionesCollection != null) {
		
			someAOperaciones = aAOperacionesCollection.getOperaciones();
			int aNumOperaciones = someAOperaciones.size();
			for( int anIndex = 0; anIndex < aNumOperaciones; anIndex++) {
				Object aAOperacionObject = someAOperaciones.get( anIndex);
				if (aAOperacionObject != null ) {
					AOperacion aAOperacion = null;
					try {
						aAOperacion = (AOperacion) aAOperacionObject;
					} 	catch( ClassCastException anException) {
					}
					if ( aAOperacion != null) {
 // 	System.out.println( aAOperacion.getEtiqueta());
						Operacion aOperacion = aAOperacion.getOperacion();
						if ( aOperacion != null) {
						if ( aOperacion == theOperacion ) {
								return aAOperacion;
							}
						}
					}
				}
			}	
		}
		
		AOperacion aAOperacion = fCreateAOperacionEnAProcedimientoFor( theAProcedimiento, theOperacion); 
		return aAOperacion;
	}
	
		

	
	public static int createAnotacionesParaDocumentosDeProcedimiento( AProcedimiento theAProcedimiento) { 
		Procedimiento 				aProcedimiento;
		EList					someDocumentos;
		int aNumAnotaciones = 0;
		
		if (theAProcedimiento == null) { return aNumAnotaciones; }
		
		aProcedimiento = theAProcedimiento.getProcedimiento();
		if( aProcedimiento == null) { return aNumAnotaciones; }
		
		someDocumentos = aProcedimiento.getDocumentos();
		int aNumDocumentos = someDocumentos.size();
		for( int anIndex = 0; anIndex < aNumDocumentos; anIndex++) {
			Object aDocumentoObject = someDocumentos.get( anIndex);
			if (aDocumentoObject != null ) {
				Documento aDocumento = null;
				try {
					aDocumento = (Documento) aDocumentoObject;
			} 	catch( ClassCastException anException) {
			}
				if ( aDocumento != null) {
// System.out.println( aDocumento.getEtiqueta());
					
					ADocumento aADocumento = fFindOrCreateADocumentoEnAProcedimientoFor( theAProcedimiento, aDocumento);
					aNumAnotaciones = aNumAnotaciones + 1;
				}
			}
		}	
		return aNumAnotaciones;
	}
	
	
	
	
	private static ADocumento fCreateADocumentoEnAProcedimientoFor( AProcedimiento theAProcedimiento, Documento theDocumento) {
		CDocumentos 	aADocumentosCollection;

		aADocumentosCollection = theAProcedimiento.getDocumentos();
		if( aADocumentosCollection == null) { 
			aADocumentosCollection = OrgcasiFactory.eINSTANCE.createCDocumentos();
			theAProcedimiento.setDocumentos(aADocumentosCollection);
		}

		ADocumento aADocumento = OrgcasiFactory.eINSTANCE.createADocumento();
		aADocumento.setDocumento(theDocumento);
		
		aADocumentosCollection.getDocumentos().add( aADocumento);
		
		return aADocumento;
	}
	
	
	
	private static ADocumento fFindOrCreateADocumentoEnAProcedimientoFor( AProcedimiento theAProcedimiento, Documento theDocumento) {
		CDocumentos 	aDocumentosCollection;
		EList			someDocumentoConAnotacions;

		if( theAProcedimiento == null) { return null;}
		if( theDocumento == null) { return null;}
		
		aDocumentosCollection = theAProcedimiento.getDocumentos();
		if( aDocumentosCollection != null) {
		
			someDocumentoConAnotacions = aDocumentosCollection.getDocumentos();
			int aNumDocumentos = someDocumentoConAnotacions.size();
			for( int anIndex = 0; anIndex < aNumDocumentos; anIndex++) {
				Object aADocumentoObject = someDocumentoConAnotacions.get( anIndex);
				if (aADocumentoObject != null ) {
					ADocumento aADocumento = null;
					try {
						aADocumento = (ADocumento) aADocumentoObject;
					} 	catch( ClassCastException anException) {
					}
					if ( aADocumento != null) {
 // 	System.out.println( aDocumentoConAnotacion.getEtiqueta());
						Documento aDocumento = aADocumento.getDocumento();
						if ( aDocumento != null) {
						if ( aDocumento == theDocumento ) {
								return aADocumento;
							}
						}
					}
				}
			}	
		}
		
		ADocumento aADocumento = fCreateADocumentoEnAProcedimientoFor( theAProcedimiento, theDocumento); 
		return aADocumento;
	}
	
		

	
	public static int createAnotacionesParaAplicacionesDeProcedimiento( AProcedimiento theAProcedimiento) { 
		Procedimiento 				aProcedimiento;
		EList					someAplicaciones;
		int aNumAnotaciones = 0;
		
		if (theAProcedimiento == null) { return aNumAnotaciones; }
		
		aProcedimiento = theAProcedimiento.getProcedimiento();
		if( aProcedimiento == null) { return aNumAnotaciones; }
		
		someAplicaciones = aProcedimiento.getAplicaciones();
		int aNumAplicaciones = someAplicaciones.size();
		for( int anIndex = 0; anIndex < aNumAplicaciones; anIndex++) {
			Object aAplicacionObject = someAplicaciones.get( anIndex);
			if (aAplicacionObject != null ) {
				Aplicacion aAplicacion = null;
				try {
					aAplicacion = (Aplicacion) aAplicacionObject;
			} 	catch( ClassCastException anException) {
			}
				if ( aAplicacion != null) {
// System.out.println( aAplicacion.getEtiqueta());
					
					AAplicacion aAAplicacion = fFindOrCreateAAplicacionEnAProcedimientoFor( theAProcedimiento, aAplicacion);
					aNumAnotaciones = aNumAnotaciones + 1;
				}
			}
		}	
		return aNumAnotaciones;
	}
	
	
	
	
	private static AAplicacion fCreateAAplicacionEnAProcedimientoFor( AProcedimiento theAProcedimiento, Aplicacion theAplicacion) {
		CAplicaciones 	aAAplicacionesCollection;
		EList						someAAplicaciones;

		aAAplicacionesCollection = theAProcedimiento.getAplicaciones();
		if( aAAplicacionesCollection == null) { 
			aAAplicacionesCollection = OrgcasiFactory.eINSTANCE.createCAplicaciones();
			theAProcedimiento.setAplicaciones(aAAplicacionesCollection);
		}

		AAplicacion aAAplicacion = OrgcasiFactory.eINSTANCE.createAAplicacion();
		aAAplicacion.setAplicacion(theAplicacion);
		
		aAAplicacionesCollection.getAplicaciones().add( aAAplicacion);
		
		return aAAplicacion;
	}
	
	
	
	private static AAplicacion fFindOrCreateAAplicacionEnAProcedimientoFor( AProcedimiento theAProcedimiento, Aplicacion theAplicacion) {
		CAplicaciones 	aAAplicacionesCollection;
		EList						someAAplicaciones;

		if( theAProcedimiento == null) { return null;}
		if( theAplicacion == null) { return null;}
		
		aAAplicacionesCollection = theAProcedimiento.getAplicaciones();
		if( aAAplicacionesCollection != null) {
		
			someAAplicaciones = aAAplicacionesCollection.getAplicaciones();
			int aNumAplicaciones = someAAplicaciones.size();
			for( int anIndex = 0; anIndex < aNumAplicaciones; anIndex++) {
				Object aAAplicacionObject = someAAplicaciones.get( anIndex);
				if (aAAplicacionObject != null ) {
					AAplicacion aAAplicacion = null;
					try {
						aAAplicacion = (AAplicacion) aAAplicacionObject;
					} 	catch( ClassCastException anException) {
					}
					if ( aAAplicacion != null) {
 // 	System.out.println( aAAplicacion.getEtiqueta());
						Aplicacion aAplicacion = aAAplicacion.getAplicacion();
						if ( aAplicacion != null) {
						if ( aAplicacion == theAplicacion ) {
								return aAAplicacion;
							}
						}
					}
				}
			}	
		}
		
		AAplicacion aAAplicacion = fCreateAAplicacionEnAProcedimientoFor( theAProcedimiento, theAplicacion); 
		return aAAplicacion;
	}
	
	
	
	
	
	public static int createAnotacionesParaFlujosDeOperacion( AProcedimiento theAProcedimiento, Operacion theOperacion) { 
		Procedimiento 				aProcedimiento;
		EList						someFlujos;
		int aNumAnotaciones = 0;
		
		if (theAProcedimiento == null) { return aNumAnotaciones; }
		if (theOperacion == null) { return aNumAnotaciones; }
		
		aProcedimiento = theAProcedimiento.getProcedimiento();
		if( aProcedimiento == null) { return aNumAnotaciones; }
		
		someFlujos = theOperacion.getFlujosSalientes();
		int aNumFlujos = someFlujos.size();
		for( int anIndex = 0; anIndex < aNumFlujos; anIndex++) {
			Object aFlujoObject = someFlujos.get( anIndex);
			if (aFlujoObject != null ) {
				Flujo aFlujo = null;
				try {
					aFlujo = (Flujo) aFlujoObject;
			} 	catch( ClassCastException anException) {
			}
				if ( aFlujo != null) {
// System.out.println( aFlujo.getEtiqueta());
					
					AFlujo aAFlujo = fFindOrCreateAFlujoEnAProcedimientoFor( theAProcedimiento, aFlujo);
					aNumAnotaciones = aNumAnotaciones + 1;
				}
			}
		}	
		return aNumAnotaciones;
	}
	
	




	
	

	
	public static int createAnotacionesParaFlujosDeProcedimiento( AProcedimiento theAProcedimiento) { 
		Procedimiento 				aProcedimiento;
		Operaciones					aOperacionesCollection;
		EList						someOperaciones;
		int aNumAnotaciones = 0;
		
		if (theAProcedimiento == null) { return aNumAnotaciones; }
		
		aProcedimiento = theAProcedimiento.getProcedimiento();
		if( aProcedimiento == null) { return aNumAnotaciones; }
		
		aOperacionesCollection = aProcedimiento.getOperaciones();
		if ( aOperacionesCollection == null) { return aNumAnotaciones; }
		
		someOperaciones = aOperacionesCollection.getOperaciones();
		int aNumOperaciones = someOperaciones.size();
		for( int anIndex = 0; anIndex < aNumOperaciones; anIndex++) {
			Object aOperacionObject = someOperaciones.get( anIndex);
			if (aOperacionObject != null ) {
				Operacion aOperacion = null;
				try {
					aOperacion = (Operacion) aOperacionObject;
			} 	catch( ClassCastException anException) {
			}
				if ( aOperacion != null) {
// System.out.println( aOperacion.getEtiqueta());
					
					createAnotacionesParaFlujosDeOperacion( theAProcedimiento, aOperacion);
					aNumAnotaciones = aNumAnotaciones + 1;
				}
			}
		}	
		return aNumAnotaciones;
	}
	
	
	
	
	
	
	private static AFlujo fCreateAFlujoEnAProcedimientoFor( AProcedimiento theAProcedimiento, Flujo theFlujo) {
		CFlujos 	aAFlujosCollection;
		AFlujo 		aAFlujo;

		aAFlujosCollection = theAProcedimiento.getFlujos();
		if( aAFlujosCollection == null) { 
			aAFlujosCollection = OrgcasiFactory.eINSTANCE.createCFlujos();
			theAProcedimiento.setFlujos(aAFlujosCollection);
		}

		aAFlujo = OrgcasiFactory.eINSTANCE.createAFlujo();
		aAFlujo.setFlujo( theFlujo);
				
		aAFlujosCollection.getFlujos().add( aAFlujo);
		
		return aAFlujo;
	}
	
	
	
	private static AFlujo fFindOrCreateAFlujoEnAProcedimientoFor( AProcedimiento theAProcedimiento, Flujo theFlujo) {
		CFlujos 	aAFlujosCollection;
		EList						someAFlujos;

		if( theAProcedimiento == null) { return null;}
		if( theFlujo == null) { return null;}
		
		aAFlujosCollection = theAProcedimiento.getFlujos();
		if( aAFlujosCollection != null) {
		
			someAFlujos = aAFlujosCollection.getFlujos();
			int aNumFlujos = someAFlujos.size();
			for( int anIndex = 0; anIndex < aNumFlujos; anIndex++) {
				Object aAFlujoObject = someAFlujos.get( anIndex);
				if (aAFlujoObject != null ) {
					AFlujo aAFlujo = null;
					try {
						aAFlujo = (AFlujo) aAFlujoObject;
					} 	catch( ClassCastException anException) {
					}
					if ( aAFlujo != null) {
 // 	System.out.println( aAFlujo.getEtiqueta());
						Flujo aFlujo = aAFlujo.getFlujo();
						if ( aFlujo != null) {
						if ( aFlujo == theFlujo ) {
								return aAFlujo;
							}
						}
					}
				}
			}	
		}
		
		AFlujo aAFlujo = fCreateAFlujoEnAProcedimientoFor( theAProcedimiento, theFlujo); 
		return aAFlujo;
	}
	
		




}
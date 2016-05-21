package eu.ttc.dataflow.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.ttc.dataflow.services.DataflowDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataflowDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllInstances'", "'{'", "'field'", "'nsURI'", "'typeName'", "'target'", "'}'", "'NewInstance'", "'Filter'", "'filterByField'", "'rejectTarget'", "'Sort'", "'sortByField'", "'Product'", "'GetFeature'", "'objectField'", "'valueField'", "'feature'", "'SetFeature'", "'NewContainer'", "'listField'", "'containerType'", "'AddToContainer'", "'positionField'", "'Evaluate'", "'expression'", "'('", "')'", "'true'", "'false'", "'.'", "'E'", "'e'", "'-'", "'list'", "'set'", "'or'", "'and'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'*'", "'/'", "'%'", "'not'", "'size'", "'defined'", "'undefined'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDataflowDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataflowDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataflowDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataflowDSL.g"; }



     	private DataflowDSLGrammarAccess grammarAccess;

        public InternalDataflowDSLParser(TokenStream input, DataflowDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DataflowDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDataflowDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDataflowDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalDataflowDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDataflowDSL.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:78:2: ( ( () ( (lv_elements_1_0= ruleElement ) )* ) )
            // InternalDataflowDSL.g:79:2: ( () ( (lv_elements_1_0= ruleElement ) )* )
            {
            // InternalDataflowDSL.g:79:2: ( () ( (lv_elements_1_0= ruleElement ) )* )
            // InternalDataflowDSL.g:80:3: () ( (lv_elements_1_0= ruleElement ) )*
            {
            // InternalDataflowDSL.g:80:3: ()
            // InternalDataflowDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalDataflowDSL.g:87:3: ( (lv_elements_1_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=18 && LA1_0<=19)||LA1_0==22||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=29 && LA1_0<=30)||LA1_0==33||LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDataflowDSL.g:88:4: (lv_elements_1_0= ruleElement )
            	    {
            	    // InternalDataflowDSL.g:88:4: (lv_elements_1_0= ruleElement )
            	    // InternalDataflowDSL.g:89:5: lv_elements_1_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"eu.ttc.dataflow.DataflowDSL.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalDataflowDSL.g:110:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDataflowDSL.g:110:48: (iv_ruleElement= ruleElement EOF )
            // InternalDataflowDSL.g:111:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDataflowDSL.g:117:1: ruleElement returns [EObject current=null] : (this_AllInstances_0= ruleAllInstances | this_NewInstance_1= ruleNewInstance | this_Filter_2= ruleFilter | this_Sort_3= ruleSort | this_Product_4= ruleProduct | this_GetFeature_5= ruleGetFeature | this_SetFeature_6= ruleSetFeature | this_NewContainer_7= ruleNewContainer | this_AddToContainer_8= ruleAddToContainer | this_Evaluate_9= ruleEvaluate ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_AllInstances_0 = null;

        EObject this_NewInstance_1 = null;

        EObject this_Filter_2 = null;

        EObject this_Sort_3 = null;

        EObject this_Product_4 = null;

        EObject this_GetFeature_5 = null;

        EObject this_SetFeature_6 = null;

        EObject this_NewContainer_7 = null;

        EObject this_AddToContainer_8 = null;

        EObject this_Evaluate_9 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:123:2: ( (this_AllInstances_0= ruleAllInstances | this_NewInstance_1= ruleNewInstance | this_Filter_2= ruleFilter | this_Sort_3= ruleSort | this_Product_4= ruleProduct | this_GetFeature_5= ruleGetFeature | this_SetFeature_6= ruleSetFeature | this_NewContainer_7= ruleNewContainer | this_AddToContainer_8= ruleAddToContainer | this_Evaluate_9= ruleEvaluate ) )
            // InternalDataflowDSL.g:124:2: (this_AllInstances_0= ruleAllInstances | this_NewInstance_1= ruleNewInstance | this_Filter_2= ruleFilter | this_Sort_3= ruleSort | this_Product_4= ruleProduct | this_GetFeature_5= ruleGetFeature | this_SetFeature_6= ruleSetFeature | this_NewContainer_7= ruleNewContainer | this_AddToContainer_8= ruleAddToContainer | this_Evaluate_9= ruleEvaluate )
            {
            // InternalDataflowDSL.g:124:2: (this_AllInstances_0= ruleAllInstances | this_NewInstance_1= ruleNewInstance | this_Filter_2= ruleFilter | this_Sort_3= ruleSort | this_Product_4= ruleProduct | this_GetFeature_5= ruleGetFeature | this_SetFeature_6= ruleSetFeature | this_NewContainer_7= ruleNewContainer | this_AddToContainer_8= ruleAddToContainer | this_Evaluate_9= ruleEvaluate )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 25:
                {
                alt2=6;
                }
                break;
            case 29:
                {
                alt2=7;
                }
                break;
            case 30:
                {
                alt2=8;
                }
                break;
            case 33:
                {
                alt2=9;
                }
                break;
            case 35:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDataflowDSL.g:125:3: this_AllInstances_0= ruleAllInstances
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAllInstancesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllInstances_0=ruleAllInstances();

                    state._fsp--;


                    			current = this_AllInstances_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:134:3: this_NewInstance_1= ruleNewInstance
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getNewInstanceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NewInstance_1=ruleNewInstance();

                    state._fsp--;


                    			current = this_NewInstance_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:143:3: this_Filter_2= ruleFilter
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Filter_2=ruleFilter();

                    state._fsp--;


                    			current = this_Filter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:152:3: this_Sort_3= ruleSort
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSortParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sort_3=ruleSort();

                    state._fsp--;


                    			current = this_Sort_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDataflowDSL.g:161:3: this_Product_4= ruleProduct
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getProductParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Product_4=ruleProduct();

                    state._fsp--;


                    			current = this_Product_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDataflowDSL.g:170:3: this_GetFeature_5= ruleGetFeature
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getGetFeatureParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetFeature_5=ruleGetFeature();

                    state._fsp--;


                    			current = this_GetFeature_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDataflowDSL.g:179:3: this_SetFeature_6= ruleSetFeature
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSetFeatureParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetFeature_6=ruleSetFeature();

                    state._fsp--;


                    			current = this_SetFeature_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDataflowDSL.g:188:3: this_NewContainer_7= ruleNewContainer
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getNewContainerParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_NewContainer_7=ruleNewContainer();

                    state._fsp--;


                    			current = this_NewContainer_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDataflowDSL.g:197:3: this_AddToContainer_8= ruleAddToContainer
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAddToContainerParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddToContainer_8=ruleAddToContainer();

                    state._fsp--;


                    			current = this_AddToContainer_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDataflowDSL.g:206:3: this_Evaluate_9= ruleEvaluate
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEvaluateParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Evaluate_9=ruleEvaluate();

                    state._fsp--;


                    			current = this_Evaluate_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAllInstances"
    // InternalDataflowDSL.g:218:1: entryRuleAllInstances returns [EObject current=null] : iv_ruleAllInstances= ruleAllInstances EOF ;
    public final EObject entryRuleAllInstances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllInstances = null;


        try {
            // InternalDataflowDSL.g:218:53: (iv_ruleAllInstances= ruleAllInstances EOF )
            // InternalDataflowDSL.g:219:2: iv_ruleAllInstances= ruleAllInstances EOF
            {
             newCompositeNode(grammarAccess.getAllInstancesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllInstances=ruleAllInstances();

            state._fsp--;

             current =iv_ruleAllInstances; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllInstances"


    // $ANTLR start "ruleAllInstances"
    // InternalDataflowDSL.g:225:1: ruleAllInstances returns [EObject current=null] : (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAllInstances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_field_4_0=null;
        Token otherlv_5=null;
        Token lv_nsURI_6_0=null;
        Token otherlv_7=null;
        Token lv_typeName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:231:2: ( (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalDataflowDSL.g:232:2: (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:232:2: (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalDataflowDSL.g:233:3: otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAllInstancesAccess().getAllInstancesKeyword_0());
            		
            // InternalDataflowDSL.g:237:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:238:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:238:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:239:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAllInstancesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllInstancesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAllInstancesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:259:3: (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataflowDSL.g:260:4: otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllInstancesAccess().getFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:264:4: ( (lv_field_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:265:5: (lv_field_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:265:5: (lv_field_4_0= RULE_ID )
                    // InternalDataflowDSL.g:266:6: lv_field_4_0= RULE_ID
                    {
                    lv_field_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_field_4_0, grammarAccess.getAllInstancesAccess().getFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllInstancesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:283:3: (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataflowDSL.g:284:4: otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAllInstancesAccess().getNsURIKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:288:4: ( (lv_nsURI_6_0= RULE_STRING ) )
                    // InternalDataflowDSL.g:289:5: (lv_nsURI_6_0= RULE_STRING )
                    {
                    // InternalDataflowDSL.g:289:5: (lv_nsURI_6_0= RULE_STRING )
                    // InternalDataflowDSL.g:290:6: lv_nsURI_6_0= RULE_STRING
                    {
                    lv_nsURI_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_nsURI_6_0, grammarAccess.getAllInstancesAccess().getNsURISTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllInstancesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nsURI",
                    							lv_nsURI_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:307:3: (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataflowDSL.g:308:4: otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getAllInstancesAccess().getTypeNameKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:312:4: ( (lv_typeName_8_0= RULE_ID ) )
                    // InternalDataflowDSL.g:313:5: (lv_typeName_8_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:313:5: (lv_typeName_8_0= RULE_ID )
                    // InternalDataflowDSL.g:314:6: lv_typeName_8_0= RULE_ID
                    {
                    lv_typeName_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_typeName_8_0, grammarAccess.getAllInstancesAccess().getTypeNameIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllInstancesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"typeName",
                    							lv_typeName_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:331:3: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataflowDSL.g:332:4: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAllInstancesAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:336:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDataflowDSL.g:337:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDataflowDSL.g:337:5: (otherlv_10= RULE_ID )
                    // InternalDataflowDSL.g:338:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllInstancesRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_10, grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAllInstancesAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllInstances"


    // $ANTLR start "entryRuleNewInstance"
    // InternalDataflowDSL.g:358:1: entryRuleNewInstance returns [EObject current=null] : iv_ruleNewInstance= ruleNewInstance EOF ;
    public final EObject entryRuleNewInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewInstance = null;


        try {
            // InternalDataflowDSL.g:358:52: (iv_ruleNewInstance= ruleNewInstance EOF )
            // InternalDataflowDSL.g:359:2: iv_ruleNewInstance= ruleNewInstance EOF
            {
             newCompositeNode(grammarAccess.getNewInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewInstance=ruleNewInstance();

            state._fsp--;

             current =iv_ruleNewInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewInstance"


    // $ANTLR start "ruleNewInstance"
    // InternalDataflowDSL.g:365:1: ruleNewInstance returns [EObject current=null] : (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleNewInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_field_4_0=null;
        Token otherlv_5=null;
        Token lv_nsURI_6_0=null;
        Token otherlv_7=null;
        Token lv_typeName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:371:2: ( (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalDataflowDSL.g:372:2: (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:372:2: (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalDataflowDSL.g:373:3: otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )? (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNewInstanceAccess().getNewInstanceKeyword_0());
            		
            // InternalDataflowDSL.g:377:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:378:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:378:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:379:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNewInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getNewInstanceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:399:3: (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataflowDSL.g:400:4: otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getNewInstanceAccess().getFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:404:4: ( (lv_field_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:405:5: (lv_field_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:405:5: (lv_field_4_0= RULE_ID )
                    // InternalDataflowDSL.g:406:6: lv_field_4_0= RULE_ID
                    {
                    lv_field_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_field_4_0, grammarAccess.getNewInstanceAccess().getFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewInstanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:423:3: (otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataflowDSL.g:424:4: otherlv_5= 'nsURI' ( (lv_nsURI_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getNewInstanceAccess().getNsURIKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:428:4: ( (lv_nsURI_6_0= RULE_STRING ) )
                    // InternalDataflowDSL.g:429:5: (lv_nsURI_6_0= RULE_STRING )
                    {
                    // InternalDataflowDSL.g:429:5: (lv_nsURI_6_0= RULE_STRING )
                    // InternalDataflowDSL.g:430:6: lv_nsURI_6_0= RULE_STRING
                    {
                    lv_nsURI_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_nsURI_6_0, grammarAccess.getNewInstanceAccess().getNsURISTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewInstanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nsURI",
                    							lv_nsURI_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:447:3: (otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataflowDSL.g:448:4: otherlv_7= 'typeName' ( (lv_typeName_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getNewInstanceAccess().getTypeNameKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:452:4: ( (lv_typeName_8_0= RULE_ID ) )
                    // InternalDataflowDSL.g:453:5: (lv_typeName_8_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:453:5: (lv_typeName_8_0= RULE_ID )
                    // InternalDataflowDSL.g:454:6: lv_typeName_8_0= RULE_ID
                    {
                    lv_typeName_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_typeName_8_0, grammarAccess.getNewInstanceAccess().getTypeNameIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewInstanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"typeName",
                    							lv_typeName_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:471:3: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataflowDSL.g:472:4: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getNewInstanceAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:476:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDataflowDSL.g:477:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDataflowDSL.g:477:5: (otherlv_10= RULE_ID )
                    // InternalDataflowDSL.g:478:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewInstanceRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_10, grammarAccess.getNewInstanceAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNewInstanceAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewInstance"


    // $ANTLR start "entryRuleFilter"
    // InternalDataflowDSL.g:498:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalDataflowDSL.g:498:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalDataflowDSL.g:499:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalDataflowDSL.g:505:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterByField' ( (lv_filterByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_filterByField_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:511:2: ( (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterByField' ( (lv_filterByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalDataflowDSL.g:512:2: (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterByField' ( (lv_filterByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:512:2: (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterByField' ( (lv_filterByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalDataflowDSL.g:513:3: otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterByField' ( (lv_filterByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalDataflowDSL.g:517:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:518:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:518:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:519:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:539:3: (otherlv_3= 'filterByField' ( (lv_filterByField_4_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataflowDSL.g:540:4: otherlv_3= 'filterByField' ( (lv_filterByField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getFilterByFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:544:4: ( (lv_filterByField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:545:5: (lv_filterByField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:545:5: (lv_filterByField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:546:6: lv_filterByField_4_0= RULE_ID
                    {
                    lv_filterByField_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_filterByField_4_0, grammarAccess.getFilterAccess().getFilterByFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterByField",
                    							lv_filterByField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:563:3: (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataflowDSL.g:564:4: otherlv_5= 'target' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getFilterAccess().getTargetKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:568:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDataflowDSL.g:569:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDataflowDSL.g:569:5: (otherlv_6= RULE_ID )
                    // InternalDataflowDSL.g:570:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_6, grammarAccess.getFilterAccess().getTargetElementCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:582:3: (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataflowDSL.g:583:4: otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getRejectTargetKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:587:4: ( (otherlv_8= RULE_ID ) )
                    // InternalDataflowDSL.g:588:5: (otherlv_8= RULE_ID )
                    {
                    // InternalDataflowDSL.g:588:5: (otherlv_8= RULE_ID )
                    // InternalDataflowDSL.g:589:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_8, grammarAccess.getFilterAccess().getRejectTargetElementCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleSort"
    // InternalDataflowDSL.g:609:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // InternalDataflowDSL.g:609:45: (iv_ruleSort= ruleSort EOF )
            // InternalDataflowDSL.g:610:2: iv_ruleSort= ruleSort EOF
            {
             newCompositeNode(grammarAccess.getSortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSort=ruleSort();

            state._fsp--;

             current =iv_ruleSort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSort"


    // $ANTLR start "ruleSort"
    // InternalDataflowDSL.g:616:1: ruleSort returns [EObject current=null] : (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortByField' ( (lv_sortByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_sortByField_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:622:2: ( (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortByField' ( (lv_sortByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) )
            // InternalDataflowDSL.g:623:2: (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortByField' ( (lv_sortByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            {
            // InternalDataflowDSL.g:623:2: (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortByField' ( (lv_sortByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            // InternalDataflowDSL.g:624:3: otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortByField' ( (lv_sortByField_4_0= RULE_ID ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSortAccess().getSortKeyword_0());
            		
            // InternalDataflowDSL.g:628:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:629:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:629:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:630:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSortAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:650:3: (otherlv_3= 'sortByField' ( (lv_sortByField_4_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataflowDSL.g:651:4: otherlv_3= 'sortByField' ( (lv_sortByField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSortAccess().getSortByFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:655:4: ( (lv_sortByField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:656:5: (lv_sortByField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:656:5: (lv_sortByField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:657:6: lv_sortByField_4_0= RULE_ID
                    {
                    lv_sortByField_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_sortByField_4_0, grammarAccess.getSortAccess().getSortByFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSortRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sortByField",
                    							lv_sortByField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:674:3: (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataflowDSL.g:675:4: otherlv_5= 'target' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSortAccess().getTargetKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:679:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDataflowDSL.g:680:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDataflowDSL.g:680:5: (otherlv_6= RULE_ID )
                    // InternalDataflowDSL.g:681:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSortRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_6, grammarAccess.getSortAccess().getTargetElementCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSortAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSort"


    // $ANTLR start "entryRuleProduct"
    // InternalDataflowDSL.g:701:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalDataflowDSL.g:701:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalDataflowDSL.g:702:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalDataflowDSL.g:708:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:714:2: ( (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' ) )
            // InternalDataflowDSL.g:715:2: (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' )
            {
            // InternalDataflowDSL.g:715:2: (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' )
            // InternalDataflowDSL.g:716:3: otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getProductKeyword_0());
            		
            // InternalDataflowDSL.g:720:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:721:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:721:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:722:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProductAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:742:3: (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataflowDSL.g:743:4: otherlv_3= 'target' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getProductAccess().getTargetKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:747:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDataflowDSL.g:748:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDataflowDSL.g:748:5: (otherlv_4= RULE_ID )
                    // InternalDataflowDSL.g:749:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProductRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_4, grammarAccess.getProductAccess().getTargetElementCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProductAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleGetFeature"
    // InternalDataflowDSL.g:769:1: entryRuleGetFeature returns [EObject current=null] : iv_ruleGetFeature= ruleGetFeature EOF ;
    public final EObject entryRuleGetFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetFeature = null;


        try {
            // InternalDataflowDSL.g:769:51: (iv_ruleGetFeature= ruleGetFeature EOF )
            // InternalDataflowDSL.g:770:2: iv_ruleGetFeature= ruleGetFeature EOF
            {
             newCompositeNode(grammarAccess.getGetFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetFeature=ruleGetFeature();

            state._fsp--;

             current =iv_ruleGetFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetFeature"


    // $ANTLR start "ruleGetFeature"
    // InternalDataflowDSL.g:776:1: ruleGetFeature returns [EObject current=null] : (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleGetFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_objectField_4_0=null;
        Token otherlv_5=null;
        Token lv_valueField_6_0=null;
        Token otherlv_7=null;
        Token lv_feature_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:782:2: ( (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalDataflowDSL.g:783:2: (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:783:2: (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalDataflowDSL.g:784:3: otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGetFeatureAccess().getGetFeatureKeyword_0());
            		
            // InternalDataflowDSL.g:788:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:789:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:789:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:790:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGetFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getGetFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:810:3: (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataflowDSL.g:811:4: otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getGetFeatureAccess().getObjectFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:815:4: ( (lv_objectField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:816:5: (lv_objectField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:816:5: (lv_objectField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:817:6: lv_objectField_4_0= RULE_ID
                    {
                    lv_objectField_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_objectField_4_0, grammarAccess.getGetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"objectField",
                    							lv_objectField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:834:3: (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataflowDSL.g:835:4: otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGetFeatureAccess().getValueFieldKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:839:4: ( (lv_valueField_6_0= RULE_ID ) )
                    // InternalDataflowDSL.g:840:5: (lv_valueField_6_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:840:5: (lv_valueField_6_0= RULE_ID )
                    // InternalDataflowDSL.g:841:6: lv_valueField_6_0= RULE_ID
                    {
                    lv_valueField_6_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_valueField_6_0, grammarAccess.getGetFeatureAccess().getValueFieldIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueField",
                    							lv_valueField_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:858:3: (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataflowDSL.g:859:4: otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getGetFeatureAccess().getFeatureKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:863:4: ( (lv_feature_8_0= RULE_ID ) )
                    // InternalDataflowDSL.g:864:5: (lv_feature_8_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:864:5: (lv_feature_8_0= RULE_ID )
                    // InternalDataflowDSL.g:865:6: lv_feature_8_0= RULE_ID
                    {
                    lv_feature_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_feature_8_0, grammarAccess.getGetFeatureAccess().getFeatureIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"feature",
                    							lv_feature_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:882:3: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataflowDSL.g:883:4: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getGetFeatureAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:887:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDataflowDSL.g:888:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDataflowDSL.g:888:5: (otherlv_10= RULE_ID )
                    // InternalDataflowDSL.g:889:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetFeatureRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_10, grammarAccess.getGetFeatureAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGetFeatureAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetFeature"


    // $ANTLR start "entryRuleSetFeature"
    // InternalDataflowDSL.g:909:1: entryRuleSetFeature returns [EObject current=null] : iv_ruleSetFeature= ruleSetFeature EOF ;
    public final EObject entryRuleSetFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetFeature = null;


        try {
            // InternalDataflowDSL.g:909:51: (iv_ruleSetFeature= ruleSetFeature EOF )
            // InternalDataflowDSL.g:910:2: iv_ruleSetFeature= ruleSetFeature EOF
            {
             newCompositeNode(grammarAccess.getSetFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetFeature=ruleSetFeature();

            state._fsp--;

             current =iv_ruleSetFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetFeature"


    // $ANTLR start "ruleSetFeature"
    // InternalDataflowDSL.g:916:1: ruleSetFeature returns [EObject current=null] : (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleSetFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_objectField_4_0=null;
        Token otherlv_5=null;
        Token lv_valueField_6_0=null;
        Token otherlv_7=null;
        Token lv_feature_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:922:2: ( (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalDataflowDSL.g:923:2: (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:923:2: (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalDataflowDSL.g:924:3: otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSetFeatureAccess().getSetFeatureKeyword_0());
            		
            // InternalDataflowDSL.g:928:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:929:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:929:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:930:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSetFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSetFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:950:3: (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataflowDSL.g:951:4: otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetFeatureAccess().getObjectFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:955:4: ( (lv_objectField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:956:5: (lv_objectField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:956:5: (lv_objectField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:957:6: lv_objectField_4_0= RULE_ID
                    {
                    lv_objectField_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_objectField_4_0, grammarAccess.getSetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"objectField",
                    							lv_objectField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:974:3: (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDataflowDSL.g:975:4: otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSetFeatureAccess().getValueFieldKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:979:4: ( (lv_valueField_6_0= RULE_ID ) )
                    // InternalDataflowDSL.g:980:5: (lv_valueField_6_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:980:5: (lv_valueField_6_0= RULE_ID )
                    // InternalDataflowDSL.g:981:6: lv_valueField_6_0= RULE_ID
                    {
                    lv_valueField_6_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_valueField_6_0, grammarAccess.getSetFeatureAccess().getValueFieldIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueField",
                    							lv_valueField_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:998:3: (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataflowDSL.g:999:4: otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getSetFeatureAccess().getFeatureKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1003:4: ( (lv_feature_8_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1004:5: (lv_feature_8_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1004:5: (lv_feature_8_0= RULE_ID )
                    // InternalDataflowDSL.g:1005:6: lv_feature_8_0= RULE_ID
                    {
                    lv_feature_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_feature_8_0, grammarAccess.getSetFeatureAccess().getFeatureIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"feature",
                    							lv_feature_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1022:3: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataflowDSL.g:1023:4: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getSetFeatureAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:1027:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDataflowDSL.g:1028:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1028:5: (otherlv_10= RULE_ID )
                    // InternalDataflowDSL.g:1029:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetFeatureRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_10, grammarAccess.getSetFeatureAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSetFeatureAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetFeature"


    // $ANTLR start "entryRuleNewContainer"
    // InternalDataflowDSL.g:1049:1: entryRuleNewContainer returns [EObject current=null] : iv_ruleNewContainer= ruleNewContainer EOF ;
    public final EObject entryRuleNewContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewContainer = null;


        try {
            // InternalDataflowDSL.g:1049:53: (iv_ruleNewContainer= ruleNewContainer EOF )
            // InternalDataflowDSL.g:1050:2: iv_ruleNewContainer= ruleNewContainer EOF
            {
             newCompositeNode(grammarAccess.getNewContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewContainer=ruleNewContainer();

            state._fsp--;

             current =iv_ruleNewContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewContainer"


    // $ANTLR start "ruleNewContainer"
    // InternalDataflowDSL.g:1056:1: ruleNewContainer returns [EObject current=null] : (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleNewContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_listField_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_containerType_6_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1062:2: ( (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalDataflowDSL.g:1063:2: (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:1063:2: (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalDataflowDSL.g:1064:3: otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNewContainerAccess().getNewContainerKeyword_0());
            		
            // InternalDataflowDSL.g:1068:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1069:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1069:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1070:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNewContainerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getNewContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1090:3: (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataflowDSL.g:1091:4: otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getNewContainerAccess().getListFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1095:4: ( (lv_listField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1096:5: (lv_listField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1096:5: (lv_listField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1097:6: lv_listField_4_0= RULE_ID
                    {
                    lv_listField_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_listField_4_0, grammarAccess.getNewContainerAccess().getListFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"listField",
                    							lv_listField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1114:3: (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataflowDSL.g:1115:4: otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getNewContainerAccess().getContainerTypeKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1119:4: ( (lv_containerType_6_0= ruleContainerType ) )
                    // InternalDataflowDSL.g:1120:5: (lv_containerType_6_0= ruleContainerType )
                    {
                    // InternalDataflowDSL.g:1120:5: (lv_containerType_6_0= ruleContainerType )
                    // InternalDataflowDSL.g:1121:6: lv_containerType_6_0= ruleContainerType
                    {

                    						newCompositeNode(grammarAccess.getNewContainerAccess().getContainerTypeContainerTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_containerType_6_0=ruleContainerType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNewContainerRule());
                    						}
                    						set(
                    							current,
                    							"containerType",
                    							lv_containerType_6_0,
                    							"eu.ttc.dataflow.DataflowDSL.ContainerType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1139:3: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataflowDSL.g:1140:4: otherlv_7= 'target' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getNewContainerAccess().getTargetKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1144:4: ( (otherlv_8= RULE_ID ) )
                    // InternalDataflowDSL.g:1145:5: (otherlv_8= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1145:5: (otherlv_8= RULE_ID )
                    // InternalDataflowDSL.g:1146:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewContainerRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_8, grammarAccess.getNewContainerAccess().getTargetElementCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNewContainerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewContainer"


    // $ANTLR start "entryRuleAddToContainer"
    // InternalDataflowDSL.g:1166:1: entryRuleAddToContainer returns [EObject current=null] : iv_ruleAddToContainer= ruleAddToContainer EOF ;
    public final EObject entryRuleAddToContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddToContainer = null;


        try {
            // InternalDataflowDSL.g:1166:55: (iv_ruleAddToContainer= ruleAddToContainer EOF )
            // InternalDataflowDSL.g:1167:2: iv_ruleAddToContainer= ruleAddToContainer EOF
            {
             newCompositeNode(grammarAccess.getAddToContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddToContainer=ruleAddToContainer();

            state._fsp--;

             current =iv_ruleAddToContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddToContainer"


    // $ANTLR start "ruleAddToContainer"
    // InternalDataflowDSL.g:1173:1: ruleAddToContainer returns [EObject current=null] : (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAddToContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_listField_4_0=null;
        Token otherlv_5=null;
        Token lv_valueField_6_0=null;
        Token otherlv_7=null;
        Token lv_positionField_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:1179:2: ( (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalDataflowDSL.g:1180:2: (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:1180:2: (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalDataflowDSL.g:1181:3: otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAddToContainerAccess().getAddToContainerKeyword_0());
            		
            // InternalDataflowDSL.g:1185:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1186:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1186:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1187:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAddToContainerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddToContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAddToContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1207:3: (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataflowDSL.g:1208:4: otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddToContainerAccess().getListFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1212:4: ( (lv_listField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1213:5: (lv_listField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1213:5: (lv_listField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1214:6: lv_listField_4_0= RULE_ID
                    {
                    lv_listField_4_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(lv_listField_4_0, grammarAccess.getAddToContainerAccess().getListFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddToContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"listField",
                    							lv_listField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1231:3: (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataflowDSL.g:1232:4: otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddToContainerAccess().getValueFieldKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1236:4: ( (lv_valueField_6_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1237:5: (lv_valueField_6_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1237:5: (lv_valueField_6_0= RULE_ID )
                    // InternalDataflowDSL.g:1238:6: lv_valueField_6_0= RULE_ID
                    {
                    lv_valueField_6_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(lv_valueField_6_0, grammarAccess.getAddToContainerAccess().getValueFieldIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddToContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueField",
                    							lv_valueField_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1255:3: (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataflowDSL.g:1256:4: otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddToContainerAccess().getPositionFieldKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1260:4: ( (lv_positionField_8_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1261:5: (lv_positionField_8_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1261:5: (lv_positionField_8_0= RULE_ID )
                    // InternalDataflowDSL.g:1262:6: lv_positionField_8_0= RULE_ID
                    {
                    lv_positionField_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_positionField_8_0, grammarAccess.getAddToContainerAccess().getPositionFieldIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddToContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"positionField",
                    							lv_positionField_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1279:3: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataflowDSL.g:1280:4: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAddToContainerAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:1284:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDataflowDSL.g:1285:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1285:5: (otherlv_10= RULE_ID )
                    // InternalDataflowDSL.g:1286:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddToContainerRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_10, grammarAccess.getAddToContainerAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAddToContainerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddToContainer"


    // $ANTLR start "entryRuleEvaluate"
    // InternalDataflowDSL.g:1306:1: entryRuleEvaluate returns [EObject current=null] : iv_ruleEvaluate= ruleEvaluate EOF ;
    public final EObject entryRuleEvaluate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluate = null;


        try {
            // InternalDataflowDSL.g:1306:49: (iv_ruleEvaluate= ruleEvaluate EOF )
            // InternalDataflowDSL.g:1307:2: iv_ruleEvaluate= ruleEvaluate EOF
            {
             newCompositeNode(grammarAccess.getEvaluateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluate=ruleEvaluate();

            state._fsp--;

             current =iv_ruleEvaluate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluate"


    // $ANTLR start "ruleEvaluate"
    // InternalDataflowDSL.g:1313:1: ruleEvaluate returns [EObject current=null] : (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleOrExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleEvaluate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_field_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1319:2: ( (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleOrExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalDataflowDSL.g:1320:2: (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleOrExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:1320:2: (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleOrExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalDataflowDSL.g:1321:3: otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleOrExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvaluateAccess().getEvaluateKeyword_0());
            		
            // InternalDataflowDSL.g:1325:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1326:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1326:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1327:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvaluateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvaluateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getEvaluateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1347:3: (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataflowDSL.g:1348:4: otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvaluateAccess().getFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1352:4: ( (lv_field_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1353:5: (lv_field_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1353:5: (lv_field_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1354:6: lv_field_4_0= RULE_ID
                    {
                    lv_field_4_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(lv_field_4_0, grammarAccess.getEvaluateAccess().getFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1371:3: (otherlv_5= 'expression' ( (lv_expression_6_0= ruleOrExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataflowDSL.g:1372:4: otherlv_5= 'expression' ( (lv_expression_6_0= ruleOrExpression ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvaluateAccess().getExpressionKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1376:4: ( (lv_expression_6_0= ruleOrExpression ) )
                    // InternalDataflowDSL.g:1377:5: (lv_expression_6_0= ruleOrExpression )
                    {
                    // InternalDataflowDSL.g:1377:5: (lv_expression_6_0= ruleOrExpression )
                    // InternalDataflowDSL.g:1378:6: lv_expression_6_0= ruleOrExpression
                    {

                    						newCompositeNode(grammarAccess.getEvaluateAccess().getExpressionOrExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_expression_6_0=ruleOrExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluateRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"eu.ttc.dataflow.DataflowDSL.OrExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1396:3: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDataflowDSL.g:1397:4: otherlv_7= 'target' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getEvaluateAccess().getTargetKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1401:4: ( (otherlv_8= RULE_ID ) )
                    // InternalDataflowDSL.g:1402:5: (otherlv_8= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1402:5: (otherlv_8= RULE_ID )
                    // InternalDataflowDSL.g:1403:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_8, grammarAccess.getEvaluateAccess().getTargetElementCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEvaluateAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluate"


    // $ANTLR start "entryRuleOrExpression"
    // InternalDataflowDSL.g:1423:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalDataflowDSL.g:1423:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalDataflowDSL.g:1424:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalDataflowDSL.g:1430:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1436:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )? ) )
            // InternalDataflowDSL.g:1437:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )? )
            {
            // InternalDataflowDSL.g:1437:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )? )
            // InternalDataflowDSL.g:1438:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:1446:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataflowDSL.g:1447:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) )
                    {
                    // InternalDataflowDSL.g:1447:4: ()
                    // InternalDataflowDSL.g:1448:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getOrExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:1454:4: ( (lv_operator_2_0= ruleOrOperator ) )
                    // InternalDataflowDSL.g:1455:5: (lv_operator_2_0= ruleOrOperator )
                    {
                    // InternalDataflowDSL.g:1455:5: (lv_operator_2_0= ruleOrOperator )
                    // InternalDataflowDSL.g:1456:6: lv_operator_2_0= ruleOrOperator
                    {

                    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operator_2_0=ruleOrOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"eu.ttc.dataflow.DataflowDSL.OrOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataflowDSL.g:1473:4: ( (lv_rightExpression_3_0= ruleAndExpression ) )
                    // InternalDataflowDSL.g:1474:5: (lv_rightExpression_3_0= ruleAndExpression )
                    {
                    // InternalDataflowDSL.g:1474:5: (lv_rightExpression_3_0= ruleAndExpression )
                    // InternalDataflowDSL.g:1475:6: lv_rightExpression_3_0= ruleAndExpression
                    {

                    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleAndExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rightExpression",
                    							lv_rightExpression_3_0,
                    							"eu.ttc.dataflow.DataflowDSL.AndExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalDataflowDSL.g:1497:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalDataflowDSL.g:1497:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalDataflowDSL.g:1498:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalDataflowDSL.g:1504:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1510:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )? ) )
            // InternalDataflowDSL.g:1511:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )? )
            {
            // InternalDataflowDSL.g:1511:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )? )
            // InternalDataflowDSL.g:1512:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:1520:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataflowDSL.g:1521:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) )
                    {
                    // InternalDataflowDSL.g:1521:4: ()
                    // InternalDataflowDSL.g:1522:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getAndExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:1528:4: ( (lv_operator_2_0= ruleAndOperator ) )
                    // InternalDataflowDSL.g:1529:5: (lv_operator_2_0= ruleAndOperator )
                    {
                    // InternalDataflowDSL.g:1529:5: (lv_operator_2_0= ruleAndOperator )
                    // InternalDataflowDSL.g:1530:6: lv_operator_2_0= ruleAndOperator
                    {

                    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operator_2_0=ruleAndOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"eu.ttc.dataflow.DataflowDSL.AndOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataflowDSL.g:1547:4: ( (lv_rightExpression_3_0= ruleEqualityExpression ) )
                    // InternalDataflowDSL.g:1548:5: (lv_rightExpression_3_0= ruleEqualityExpression )
                    {
                    // InternalDataflowDSL.g:1548:5: (lv_rightExpression_3_0= ruleEqualityExpression )
                    // InternalDataflowDSL.g:1549:6: lv_rightExpression_3_0= ruleEqualityExpression
                    {

                    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExpressionEqualityExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleEqualityExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rightExpression",
                    							lv_rightExpression_3_0,
                    							"eu.ttc.dataflow.DataflowDSL.EqualityExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalDataflowDSL.g:1571:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalDataflowDSL.g:1571:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalDataflowDSL.g:1572:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalDataflowDSL.g:1578:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )? ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1584:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )? ) )
            // InternalDataflowDSL.g:1585:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )? )
            {
            // InternalDataflowDSL.g:1585:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )? )
            // InternalDataflowDSL.g:1586:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:1594:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=49 && LA37_0<=50)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataflowDSL.g:1595:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) )
                    {
                    // InternalDataflowDSL.g:1595:4: ()
                    // InternalDataflowDSL.g:1596:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:1602:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
                    // InternalDataflowDSL.g:1603:5: (lv_operator_2_0= ruleEqualityOperator )
                    {
                    // InternalDataflowDSL.g:1603:5: (lv_operator_2_0= ruleEqualityOperator )
                    // InternalDataflowDSL.g:1604:6: lv_operator_2_0= ruleEqualityOperator
                    {

                    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operator_2_0=ruleEqualityOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"eu.ttc.dataflow.DataflowDSL.EqualityOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataflowDSL.g:1621:4: ( (lv_rightExpression_3_0= ruleRelationalExpression ) )
                    // InternalDataflowDSL.g:1622:5: (lv_rightExpression_3_0= ruleRelationalExpression )
                    {
                    // InternalDataflowDSL.g:1622:5: (lv_rightExpression_3_0= ruleRelationalExpression )
                    // InternalDataflowDSL.g:1623:6: lv_rightExpression_3_0= ruleRelationalExpression
                    {

                    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightExpressionRelationalExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleRelationalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rightExpression",
                    							lv_rightExpression_3_0,
                    							"eu.ttc.dataflow.DataflowDSL.RelationalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalDataflowDSL.g:1645:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalDataflowDSL.g:1645:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalDataflowDSL.g:1646:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalDataflowDSL.g:1652:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1658:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalDataflowDSL.g:1659:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalDataflowDSL.g:1659:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )? )
            // InternalDataflowDSL.g:1660:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:1668:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=51 && LA38_0<=54)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataflowDSL.g:1669:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalDataflowDSL.g:1669:4: ()
                    // InternalDataflowDSL.g:1670:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:1676:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
                    // InternalDataflowDSL.g:1677:5: (lv_operator_2_0= ruleRelationalOperator )
                    {
                    // InternalDataflowDSL.g:1677:5: (lv_operator_2_0= ruleRelationalOperator )
                    // InternalDataflowDSL.g:1678:6: lv_operator_2_0= ruleRelationalOperator
                    {

                    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operator_2_0=ruleRelationalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"eu.ttc.dataflow.DataflowDSL.RelationalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataflowDSL.g:1695:4: ( (lv_rightExpression_3_0= ruleAdditiveExpression ) )
                    // InternalDataflowDSL.g:1696:5: (lv_rightExpression_3_0= ruleAdditiveExpression )
                    {
                    // InternalDataflowDSL.g:1696:5: (lv_rightExpression_3_0= ruleAdditiveExpression )
                    // InternalDataflowDSL.g:1697:6: lv_rightExpression_3_0= ruleAdditiveExpression
                    {

                    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightExpressionAdditiveExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleAdditiveExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rightExpression",
                    							lv_rightExpression_3_0,
                    							"eu.ttc.dataflow.DataflowDSL.AdditiveExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalDataflowDSL.g:1719:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalDataflowDSL.g:1719:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalDataflowDSL.g:1720:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalDataflowDSL.g:1726:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )? ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1732:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )? ) )
            // InternalDataflowDSL.g:1733:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )? )
            {
            // InternalDataflowDSL.g:1733:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )? )
            // InternalDataflowDSL.g:1734:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:1742:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44||LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDataflowDSL.g:1743:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) )
                    {
                    // InternalDataflowDSL.g:1743:4: ()
                    // InternalDataflowDSL.g:1744:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:1750:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
                    // InternalDataflowDSL.g:1751:5: (lv_operator_2_0= ruleAdditiveOperator )
                    {
                    // InternalDataflowDSL.g:1751:5: (lv_operator_2_0= ruleAdditiveOperator )
                    // InternalDataflowDSL.g:1752:6: lv_operator_2_0= ruleAdditiveOperator
                    {

                    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operator_2_0=ruleAdditiveOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"eu.ttc.dataflow.DataflowDSL.AdditiveOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataflowDSL.g:1769:4: ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) )
                    // InternalDataflowDSL.g:1770:5: (lv_rightExpression_3_0= ruleMultiplicativeExpression )
                    {
                    // InternalDataflowDSL.g:1770:5: (lv_rightExpression_3_0= ruleMultiplicativeExpression )
                    // InternalDataflowDSL.g:1771:6: lv_rightExpression_3_0= ruleMultiplicativeExpression
                    {

                    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExpressionMultiplicativeExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleMultiplicativeExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rightExpression",
                    							lv_rightExpression_3_0,
                    							"eu.ttc.dataflow.DataflowDSL.MultiplicativeExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalDataflowDSL.g:1793:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalDataflowDSL.g:1793:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalDataflowDSL.g:1794:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalDataflowDSL.g:1800:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )? ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1806:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )? ) )
            // InternalDataflowDSL.g:1807:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )? )
            {
            // InternalDataflowDSL.g:1807:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )? )
            // InternalDataflowDSL.g:1808:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:1816:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=56 && LA40_0<=58)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDataflowDSL.g:1817:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) )
                    {
                    // InternalDataflowDSL.g:1817:4: ()
                    // InternalDataflowDSL.g:1818:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:1824:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
                    // InternalDataflowDSL.g:1825:5: (lv_operator_2_0= ruleMultiplicativeOperator )
                    {
                    // InternalDataflowDSL.g:1825:5: (lv_operator_2_0= ruleMultiplicativeOperator )
                    // InternalDataflowDSL.g:1826:6: lv_operator_2_0= ruleMultiplicativeOperator
                    {

                    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operator_2_0=ruleMultiplicativeOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"eu.ttc.dataflow.DataflowDSL.MultiplicativeOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataflowDSL.g:1843:4: ( (lv_rightExpression_3_0= ruleUnaryExpression ) )
                    // InternalDataflowDSL.g:1844:5: (lv_rightExpression_3_0= ruleUnaryExpression )
                    {
                    // InternalDataflowDSL.g:1844:5: (lv_rightExpression_3_0= ruleUnaryExpression )
                    // InternalDataflowDSL.g:1845:6: lv_rightExpression_3_0= ruleUnaryExpression
                    {

                    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleUnaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rightExpression",
                    							lv_rightExpression_3_0,
                    							"eu.ttc.dataflow.DataflowDSL.UnaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalDataflowDSL.g:1867:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalDataflowDSL.g:1867:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDataflowDSL.g:1868:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalDataflowDSL.g:1874:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_expression_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1880:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalDataflowDSL.g:1881:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalDataflowDSL.g:1881:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44||(LA41_0>=59 && LA41_0<=62)) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||LA41_0==37||(LA41_0>=39 && LA41_0<=41)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalDataflowDSL.g:1882:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalDataflowDSL.g:1882:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    // InternalDataflowDSL.g:1883:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) )
                    {
                    // InternalDataflowDSL.g:1883:4: ()
                    // InternalDataflowDSL.g:1884:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getUnaryOperationAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:1890:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalDataflowDSL.g:1891:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalDataflowDSL.g:1891:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalDataflowDSL.g:1892:6: lv_operator_1_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operator_1_0=ruleUnaryOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"eu.ttc.dataflow.DataflowDSL.UnaryOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataflowDSL.g:1909:4: ( (lv_expression_2_0= ruleUnaryExpression ) )
                    // InternalDataflowDSL.g:1910:5: (lv_expression_2_0= ruleUnaryExpression )
                    {
                    // InternalDataflowDSL.g:1910:5: (lv_expression_2_0= ruleUnaryExpression )
                    // InternalDataflowDSL.g:1911:6: lv_expression_2_0= ruleUnaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionUnaryExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleUnaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"eu.ttc.dataflow.DataflowDSL.UnaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1930:3: this_PrimaryExpression_3= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_3=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalDataflowDSL.g:1942:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalDataflowDSL.g:1942:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalDataflowDSL.g:1943:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalDataflowDSL.g:1949:1: rulePrimaryExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_7_0=null;
        Token lv_field_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject this_OrExpression_11 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1955:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) ) )
            // InternalDataflowDSL.g:1956:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) )
            {
            // InternalDataflowDSL.g:1956:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) )
            int alt42=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==EOF||(LA42_1>=16 && LA42_1<=17)||LA42_1==38||LA42_1==44||(LA42_1>=47 && LA42_1<=58)) ) {
                    alt42=1;
                }
                else if ( (LA42_1==41) ) {
                    alt42=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case 39:
            case 40:
                {
                alt42=2;
                }
                break;
            case 41:
                {
                alt42=3;
                }
                break;
            case RULE_STRING:
                {
                alt42=4;
                }
                break;
            case RULE_ID:
                {
                alt42=5;
                }
                break;
            case 37:
                {
                alt42=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalDataflowDSL.g:1957:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalDataflowDSL.g:1957:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalDataflowDSL.g:1958:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalDataflowDSL.g:1958:4: ()
                    // InternalDataflowDSL.g:1959:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getIntegerLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:1965:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalDataflowDSL.g:1966:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalDataflowDSL.g:1966:5: (lv_value_1_0= ruleEInt )
                    // InternalDataflowDSL.g:1967:6: lv_value_1_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueEIntParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"eu.ttc.dataflow.DataflowDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1986:3: ( () ( (lv_value_3_0= ruleEBoolean ) ) )
                    {
                    // InternalDataflowDSL.g:1986:3: ( () ( (lv_value_3_0= ruleEBoolean ) ) )
                    // InternalDataflowDSL.g:1987:4: () ( (lv_value_3_0= ruleEBoolean ) )
                    {
                    // InternalDataflowDSL.g:1987:4: ()
                    // InternalDataflowDSL.g:1988:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:1994:4: ( (lv_value_3_0= ruleEBoolean ) )
                    // InternalDataflowDSL.g:1995:5: (lv_value_3_0= ruleEBoolean )
                    {
                    // InternalDataflowDSL.g:1995:5: (lv_value_3_0= ruleEBoolean )
                    // InternalDataflowDSL.g:1996:6: lv_value_3_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueEBooleanParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"eu.ttc.dataflow.DataflowDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:2015:3: ( () ( (lv_value_5_0= ruleEDouble ) ) )
                    {
                    // InternalDataflowDSL.g:2015:3: ( () ( (lv_value_5_0= ruleEDouble ) ) )
                    // InternalDataflowDSL.g:2016:4: () ( (lv_value_5_0= ruleEDouble ) )
                    {
                    // InternalDataflowDSL.g:2016:4: ()
                    // InternalDataflowDSL.g:2017:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2023:4: ( (lv_value_5_0= ruleEDouble ) )
                    // InternalDataflowDSL.g:2024:5: (lv_value_5_0= ruleEDouble )
                    {
                    // InternalDataflowDSL.g:2024:5: (lv_value_5_0= ruleEDouble )
                    // InternalDataflowDSL.g:2025:6: lv_value_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"eu.ttc.dataflow.DataflowDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:2044:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalDataflowDSL.g:2044:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalDataflowDSL.g:2045:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalDataflowDSL.g:2045:4: ()
                    // InternalDataflowDSL.g:2046:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2052:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalDataflowDSL.g:2053:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalDataflowDSL.g:2053:5: (lv_value_7_0= RULE_STRING )
                    // InternalDataflowDSL.g:2054:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDataflowDSL.g:2072:3: ( () ( (lv_field_9_0= RULE_ID ) ) )
                    {
                    // InternalDataflowDSL.g:2072:3: ( () ( (lv_field_9_0= RULE_ID ) ) )
                    // InternalDataflowDSL.g:2073:4: () ( (lv_field_9_0= RULE_ID ) )
                    {
                    // InternalDataflowDSL.g:2073:4: ()
                    // InternalDataflowDSL.g:2074:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getFieldReferenceAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2080:4: ( (lv_field_9_0= RULE_ID ) )
                    // InternalDataflowDSL.g:2081:5: (lv_field_9_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:2081:5: (lv_field_9_0= RULE_ID )
                    // InternalDataflowDSL.g:2082:6: lv_field_9_0= RULE_ID
                    {
                    lv_field_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_field_9_0, grammarAccess.getPrimaryExpressionAccess().getFieldIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDataflowDSL.g:2100:3: (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' )
                    {
                    // InternalDataflowDSL.g:2100:3: (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' )
                    // InternalDataflowDSL.g:2101:4: otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_27); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_34);
                    this_OrExpression_11=ruleOrExpression();

                    state._fsp--;


                    				current = this_OrExpression_11;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleEInt"
    // InternalDataflowDSL.g:2122:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDataflowDSL.g:2122:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDataflowDSL.g:2123:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDataflowDSL.g:2129:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2135:2: (this_INT_0= RULE_INT )
            // InternalDataflowDSL.g:2136:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // InternalDataflowDSL.g:2146:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDataflowDSL.g:2146:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDataflowDSL.g:2147:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalDataflowDSL.g:2153:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2159:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDataflowDSL.g:2160:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDataflowDSL.g:2160:2: (kw= 'true' | kw= 'false' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            else if ( (LA43_0==40) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalDataflowDSL.g:2161:3: kw= 'true'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2167:3: kw= 'false'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDouble"
    // InternalDataflowDSL.g:2176:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDataflowDSL.g:2176:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDataflowDSL.g:2177:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDataflowDSL.g:2183:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2189:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalDataflowDSL.g:2190:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalDataflowDSL.g:2190:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalDataflowDSL.g:2191:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalDataflowDSL.g:2191:3: (this_INT_0= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDataflowDSL.g:2192:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_35); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_36); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_37); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalDataflowDSL.g:2212:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=42 && LA47_0<=43)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDataflowDSL.g:2213:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT
                    {
                    // InternalDataflowDSL.g:2213:4: (kw= 'E' | kw= 'e' )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==42) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==43) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalDataflowDSL.g:2214:5: kw= 'E'
                            {
                            kw=(Token)match(input,42,FOLLOW_38); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDataflowDSL.g:2220:5: kw= 'e'
                            {
                            kw=(Token)match(input,43,FOLLOW_38); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDataflowDSL.g:2226:4: (kw= '-' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==44) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalDataflowDSL.g:2227:5: kw= '-'
                            {
                            kw=(Token)match(input,44,FOLLOW_36); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1());
                            				

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_6);
                    			

                    				newLeafNode(this_INT_6, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleContainerType"
    // InternalDataflowDSL.g:2245:1: ruleContainerType returns [Enumerator current=null] : ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) ) ;
    public final Enumerator ruleContainerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2251:2: ( ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) ) )
            // InternalDataflowDSL.g:2252:2: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) )
            {
            // InternalDataflowDSL.g:2252:2: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            else if ( (LA48_0==46) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDataflowDSL.g:2253:3: (enumLiteral_0= 'list' )
                    {
                    // InternalDataflowDSL.g:2253:3: (enumLiteral_0= 'list' )
                    // InternalDataflowDSL.g:2254:4: enumLiteral_0= 'list'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2261:3: (enumLiteral_1= 'set' )
                    {
                    // InternalDataflowDSL.g:2261:3: (enumLiteral_1= 'set' )
                    // InternalDataflowDSL.g:2262:4: enumLiteral_1= 'set'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getContainerTypeAccess().getSETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getContainerTypeAccess().getSETEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerType"


    // $ANTLR start "ruleOrOperator"
    // InternalDataflowDSL.g:2272:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2278:2: ( (enumLiteral_0= 'or' ) )
            // InternalDataflowDSL.g:2279:2: (enumLiteral_0= 'or' )
            {
            // InternalDataflowDSL.g:2279:2: (enumLiteral_0= 'or' )
            // InternalDataflowDSL.g:2280:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

            			current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalDataflowDSL.g:2289:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2295:2: ( (enumLiteral_0= 'and' ) )
            // InternalDataflowDSL.g:2296:2: (enumLiteral_0= 'and' )
            {
            // InternalDataflowDSL.g:2296:2: (enumLiteral_0= 'and' )
            // InternalDataflowDSL.g:2297:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

            			current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleEqualityOperator"
    // InternalDataflowDSL.g:2306:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2312:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) )
            // InternalDataflowDSL.g:2313:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalDataflowDSL.g:2313:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==49) ) {
                alt49=1;
            }
            else if ( (LA49_0==50) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalDataflowDSL.g:2314:3: (enumLiteral_0= '=' )
                    {
                    // InternalDataflowDSL.g:2314:3: (enumLiteral_0= '=' )
                    // InternalDataflowDSL.g:2315:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2322:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDataflowDSL.g:2322:3: (enumLiteral_1= '!=' )
                    // InternalDataflowDSL.g:2323:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getEqualityOperatorAccess().getNEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEqualityOperatorAccess().getNEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalDataflowDSL.g:2333:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2339:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) )
            // InternalDataflowDSL.g:2340:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalDataflowDSL.g:2340:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt50=1;
                }
                break;
            case 52:
                {
                alt50=2;
                }
                break;
            case 53:
                {
                alt50=3;
                }
                break;
            case 54:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalDataflowDSL.g:2341:3: (enumLiteral_0= '>' )
                    {
                    // InternalDataflowDSL.g:2341:3: (enumLiteral_0= '>' )
                    // InternalDataflowDSL.g:2342:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2349:3: (enumLiteral_1= '>=' )
                    {
                    // InternalDataflowDSL.g:2349:3: (enumLiteral_1= '>=' )
                    // InternalDataflowDSL.g:2350:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:2357:3: (enumLiteral_2= '<' )
                    {
                    // InternalDataflowDSL.g:2357:3: (enumLiteral_2= '<' )
                    // InternalDataflowDSL.g:2358:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:2365:3: (enumLiteral_3= '<=' )
                    {
                    // InternalDataflowDSL.g:2365:3: (enumLiteral_3= '<=' )
                    // InternalDataflowDSL.g:2366:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalDataflowDSL.g:2376:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2382:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDataflowDSL.g:2383:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDataflowDSL.g:2383:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            else if ( (LA51_0==44) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalDataflowDSL.g:2384:3: (enumLiteral_0= '+' )
                    {
                    // InternalDataflowDSL.g:2384:3: (enumLiteral_0= '+' )
                    // InternalDataflowDSL.g:2385:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2392:3: (enumLiteral_1= '-' )
                    {
                    // InternalDataflowDSL.g:2392:3: (enumLiteral_1= '-' )
                    // InternalDataflowDSL.g:2393:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalDataflowDSL.g:2403:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2409:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalDataflowDSL.g:2410:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalDataflowDSL.g:2410:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt52=1;
                }
                break;
            case 57:
                {
                alt52=2;
                }
                break;
            case 58:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalDataflowDSL.g:2411:3: (enumLiteral_0= '*' )
                    {
                    // InternalDataflowDSL.g:2411:3: (enumLiteral_0= '*' )
                    // InternalDataflowDSL.g:2412:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2419:3: (enumLiteral_1= '/' )
                    {
                    // InternalDataflowDSL.g:2419:3: (enumLiteral_1= '/' )
                    // InternalDataflowDSL.g:2420:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:2427:3: (enumLiteral_2= '%' )
                    {
                    // InternalDataflowDSL.g:2427:3: (enumLiteral_2= '%' )
                    // InternalDataflowDSL.g:2428:4: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMODULOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getMODULOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalDataflowDSL.g:2438:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= 'size' ) | (enumLiteral_3= 'defined' ) | (enumLiteral_4= 'undefined' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2444:2: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= 'size' ) | (enumLiteral_3= 'defined' ) | (enumLiteral_4= 'undefined' ) ) )
            // InternalDataflowDSL.g:2445:2: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= 'size' ) | (enumLiteral_3= 'defined' ) | (enumLiteral_4= 'undefined' ) )
            {
            // InternalDataflowDSL.g:2445:2: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= 'size' ) | (enumLiteral_3= 'defined' ) | (enumLiteral_4= 'undefined' ) )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt53=1;
                }
                break;
            case 44:
                {
                alt53=2;
                }
                break;
            case 60:
                {
                alt53=3;
                }
                break;
            case 61:
                {
                alt53=4;
                }
                break;
            case 62:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalDataflowDSL.g:2446:3: (enumLiteral_0= 'not' )
                    {
                    // InternalDataflowDSL.g:2446:3: (enumLiteral_0= 'not' )
                    // InternalDataflowDSL.g:2447:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2454:3: (enumLiteral_1= '-' )
                    {
                    // InternalDataflowDSL.g:2454:3: (enumLiteral_1= '-' )
                    // InternalDataflowDSL.g:2455:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:2462:3: (enumLiteral_2= 'size' )
                    {
                    // InternalDataflowDSL.g:2462:3: (enumLiteral_2= 'size' )
                    // InternalDataflowDSL.g:2463:4: enumLiteral_2= 'size'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getSIZEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getSIZEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:2470:3: (enumLiteral_3= 'defined' )
                    {
                    // InternalDataflowDSL.g:2470:3: (enumLiteral_3= 'defined' )
                    // InternalDataflowDSL.g:2471:4: enumLiteral_3= 'defined'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getIS_DEFINEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnaryOperatorAccess().getIS_DEFINEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataflowDSL.g:2478:3: (enumLiteral_4= 'undefined' )
                    {
                    // InternalDataflowDSL.g:2478:3: (enumLiteral_4= 'undefined' )
                    // InternalDataflowDSL.g:2479:4: enumLiteral_4= 'undefined'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getIS_UNDEFINEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnaryOperatorAccess().getIS_UNDEFINEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000A634C0802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000330000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000830000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001C030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018030000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010030000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000180030000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100030000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000488030000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000408030000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400030000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000032000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000030000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x780013A000000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080100000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000040L});

}
/**
 * generated by Xtext 2.23.0
 */
package br.ufscar.dc.compiladores.playLang.impl;

import br.ufscar.dc.compiladores.playLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayLangFactoryImpl extends EFactoryImpl implements PlayLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PlayLangFactory init()
  {
    try
    {
      PlayLangFactory thePlayLangFactory = (PlayLangFactory)EPackage.Registry.INSTANCE.getEFactory(PlayLangPackage.eNS_URI);
      if (thePlayLangFactory != null)
      {
        return thePlayLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PlayLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlayLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PlayLangPackage.GAME: return createGame();
      case PlayLangPackage.EVENTO_GLOBAL: return createEventoGlobal();
      case PlayLangPackage.DECLARACAO: return createDeclaracao();
      case PlayLangPackage.CENA: return createCena();
      case PlayLangPackage.IMAGEM: return createImagem();
      case PlayLangPackage.TEXTO: return createTexto();
      case PlayLangPackage.ESCOLHAS: return createEscolhas();
      case PlayLangPackage.ESCOLHA: return createEscolha();
      case PlayLangPackage.COMANDO: return createComando();
      case PlayLangPackage.RANDOM: return createRandom();
      case PlayLangPackage.PLAY_SOUND: return createPlaySound();
      case PlayLangPackage.IF: return createIf();
      case PlayLangPackage.ATRIBUICAO: return createAtribuicao();
      case PlayLangPackage.EXPRESSAO: return createExpressao();
      case PlayLangPackage.TERMO_LOGICO: return createTermoLogico();
      case PlayLangPackage.FATOR_LOGICO: return createFatorLogico();
      case PlayLangPackage.PARCELA_LOGICA: return createParcela_logica();
      case PlayLangPackage.EXPRESSAO_RELACIONAL: return createExpressaoRelacional();
      case PlayLangPackage.EXPRESSAO_ARITMETICA: return createExpressaoAritmetica();
      case PlayLangPackage.TERMO: return createTermo();
      case PlayLangPackage.FATOR: return createFator();
      case PlayLangPackage.PARCELA: return createParcela();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Game createGame()
  {
    GameImpl game = new GameImpl();
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EventoGlobal createEventoGlobal()
  {
    EventoGlobalImpl eventoGlobal = new EventoGlobalImpl();
    return eventoGlobal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaracao createDeclaracao()
  {
    DeclaracaoImpl declaracao = new DeclaracaoImpl();
    return declaracao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cena createCena()
  {
    CenaImpl cena = new CenaImpl();
    return cena;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Imagem createImagem()
  {
    ImagemImpl imagem = new ImagemImpl();
    return imagem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Texto createTexto()
  {
    TextoImpl texto = new TextoImpl();
    return texto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Escolhas createEscolhas()
  {
    EscolhasImpl escolhas = new EscolhasImpl();
    return escolhas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Escolha createEscolha()
  {
    EscolhaImpl escolha = new EscolhaImpl();
    return escolha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comando createComando()
  {
    ComandoImpl comando = new ComandoImpl();
    return comando;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Random createRandom()
  {
    RandomImpl random = new RandomImpl();
    return random;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlaySound createPlaySound()
  {
    PlaySoundImpl playSound = new PlaySoundImpl();
    return playSound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Atribuicao createAtribuicao()
  {
    AtribuicaoImpl atribuicao = new AtribuicaoImpl();
    return atribuicao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expressao createExpressao()
  {
    ExpressaoImpl expressao = new ExpressaoImpl();
    return expressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TermoLogico createTermoLogico()
  {
    TermoLogicoImpl termoLogico = new TermoLogicoImpl();
    return termoLogico;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FatorLogico createFatorLogico()
  {
    FatorLogicoImpl fatorLogico = new FatorLogicoImpl();
    return fatorLogico;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parcela_logica createParcela_logica()
  {
    Parcela_logicaImpl parcela_logica = new Parcela_logicaImpl();
    return parcela_logica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressaoRelacional createExpressaoRelacional()
  {
    ExpressaoRelacionalImpl expressaoRelacional = new ExpressaoRelacionalImpl();
    return expressaoRelacional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressaoAritmetica createExpressaoAritmetica()
  {
    ExpressaoAritmeticaImpl expressaoAritmetica = new ExpressaoAritmeticaImpl();
    return expressaoAritmetica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Termo createTermo()
  {
    TermoImpl termo = new TermoImpl();
    return termo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fator createFator()
  {
    FatorImpl fator = new FatorImpl();
    return fator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parcela createParcela()
  {
    ParcelaImpl parcela = new ParcelaImpl();
    return parcela;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlayLangPackage getPlayLangPackage()
  {
    return (PlayLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PlayLangPackage getPackage()
  {
    return PlayLangPackage.eINSTANCE;
  }

} //PlayLangFactoryImpl
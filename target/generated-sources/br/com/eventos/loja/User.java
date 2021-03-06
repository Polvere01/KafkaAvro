/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.com.eventos.loja;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5870022979707963934L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"br.com.eventos.loja\",\"fields\":[{\"name\":\"nome\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"numero_favorito\",\"type\":[\"int\",\"null\"]},{\"name\":\"cor_favorita\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this User to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a User from a ByteBuffer. */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String nome;
  @Deprecated public java.lang.Integer numero_favorito;
  @Deprecated public java.lang.String cor_favorita;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param nome The new value for nome
   * @param numero_favorito The new value for numero_favorito
   * @param cor_favorita The new value for cor_favorita
   */
  public User(java.lang.String nome, java.lang.Integer numero_favorito, java.lang.String cor_favorita) {
    this.nome = nome;
    this.numero_favorito = numero_favorito;
    this.cor_favorita = cor_favorita;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nome;
    case 1: return numero_favorito;
    case 2: return cor_favorita;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nome = (java.lang.String)value$; break;
    case 1: numero_favorito = (java.lang.Integer)value$; break;
    case 2: cor_favorita = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nome' field.
   * @return The value of the 'nome' field.
   */
  public java.lang.String getNome() {
    return nome;
  }

  /**
   * Sets the value of the 'nome' field.
   * @param value the value to set.
   */
  public void setNome(java.lang.String value) {
    this.nome = value;
  }

  /**
   * Gets the value of the 'numero_favorito' field.
   * @return The value of the 'numero_favorito' field.
   */
  public java.lang.Integer getNumeroFavorito() {
    return numero_favorito;
  }

  /**
   * Sets the value of the 'numero_favorito' field.
   * @param value the value to set.
   */
  public void setNumeroFavorito(java.lang.Integer value) {
    this.numero_favorito = value;
  }

  /**
   * Gets the value of the 'cor_favorita' field.
   * @return The value of the 'cor_favorita' field.
   */
  public java.lang.String getCorFavorita() {
    return cor_favorita;
  }

  /**
   * Sets the value of the 'cor_favorita' field.
   * @param value the value to set.
   */
  public void setCorFavorita(java.lang.String value) {
    this.cor_favorita = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static br.com.eventos.loja.User.Builder newBuilder() {
    return new br.com.eventos.loja.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static br.com.eventos.loja.User.Builder newBuilder(br.com.eventos.loja.User.Builder other) {
    return new br.com.eventos.loja.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static br.com.eventos.loja.User.Builder newBuilder(br.com.eventos.loja.User other) {
    return new br.com.eventos.loja.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.String nome;
    private java.lang.Integer numero_favorito;
    private java.lang.String cor_favorita;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.com.eventos.loja.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nome)) {
        this.nome = data().deepCopy(fields()[0].schema(), other.nome);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numero_favorito)) {
        this.numero_favorito = data().deepCopy(fields()[1].schema(), other.numero_favorito);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.cor_favorita)) {
        this.cor_favorita = data().deepCopy(fields()[2].schema(), other.cor_favorita);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(br.com.eventos.loja.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.nome)) {
        this.nome = data().deepCopy(fields()[0].schema(), other.nome);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numero_favorito)) {
        this.numero_favorito = data().deepCopy(fields()[1].schema(), other.numero_favorito);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.cor_favorita)) {
        this.cor_favorita = data().deepCopy(fields()[2].schema(), other.cor_favorita);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'nome' field.
      * @return The value.
      */
    public java.lang.String getNome() {
      return nome;
    }

    /**
      * Sets the value of the 'nome' field.
      * @param value The value of 'nome'.
      * @return This builder.
      */
    public br.com.eventos.loja.User.Builder setNome(java.lang.String value) {
      validate(fields()[0], value);
      this.nome = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nome' field has been set.
      * @return True if the 'nome' field has been set, false otherwise.
      */
    public boolean hasNome() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nome' field.
      * @return This builder.
      */
    public br.com.eventos.loja.User.Builder clearNome() {
      nome = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'numero_favorito' field.
      * @return The value.
      */
    public java.lang.Integer getNumeroFavorito() {
      return numero_favorito;
    }

    /**
      * Sets the value of the 'numero_favorito' field.
      * @param value The value of 'numero_favorito'.
      * @return This builder.
      */
    public br.com.eventos.loja.User.Builder setNumeroFavorito(java.lang.Integer value) {
      validate(fields()[1], value);
      this.numero_favorito = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'numero_favorito' field has been set.
      * @return True if the 'numero_favorito' field has been set, false otherwise.
      */
    public boolean hasNumeroFavorito() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'numero_favorito' field.
      * @return This builder.
      */
    public br.com.eventos.loja.User.Builder clearNumeroFavorito() {
      numero_favorito = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'cor_favorita' field.
      * @return The value.
      */
    public java.lang.String getCorFavorita() {
      return cor_favorita;
    }

    /**
      * Sets the value of the 'cor_favorita' field.
      * @param value The value of 'cor_favorita'.
      * @return This builder.
      */
    public br.com.eventos.loja.User.Builder setCorFavorita(java.lang.String value) {
      validate(fields()[2], value);
      this.cor_favorita = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'cor_favorita' field has been set.
      * @return True if the 'cor_favorita' field has been set, false otherwise.
      */
    public boolean hasCorFavorita() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'cor_favorita' field.
      * @return This builder.
      */
    public br.com.eventos.loja.User.Builder clearCorFavorita() {
      cor_favorita = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.nome = fieldSetFlags()[0] ? this.nome : (java.lang.String) defaultValue(fields()[0]);
        record.numero_favorito = fieldSetFlags()[1] ? this.numero_favorito : (java.lang.Integer) defaultValue(fields()[1]);
        record.cor_favorita = fieldSetFlags()[2] ? this.cor_favorita : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
